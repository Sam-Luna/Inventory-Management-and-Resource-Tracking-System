# Inventory Management and Inventory Tracking System

## Overview:
This application manages inventory and sales for a company that sells PC
components and pre-built systems. Inventory is tracked at two levels:
individual parts (in-house or outsourced) and products, which represent
PC build tiers made up of multiple parts. Users can update, delete and buy a product
directly from the main screen; the system checks inventory availability
before completing the purchase and updates stock accordingly.

## Tech Stack
- Java
- Spring Boot
- Thymeleaf (HTML templates)
- Bean Validation (custom constraint annotations)
- JUnit

## Architecture

**Domain model**
- `Part` is a base type for inventory items, split into `InHousePart` and
  `OutsourcedPart`, representing individual PC components.
- `Product` represents a purchasable PC build tier, composed of
  associated parts.

**Validation**
- `@ValidInventory` and `InventoryValidator` enforce
  that a part's inventory stays within its defined min/max range,
  returning specific error messages when adding or updating parts outside
  those bounds.
- `EnufPartsValidator` prevents a product update from lowering an
  associated part's inventory below its allowed minimum, and guards
  against inventory dropping below zero.

**Purchase flow**
- `AddProductController` handles the "Buy Now" action on each product. It
  checks current inventory against the requested purchase: if
  insufficient, the user is redirected to a Failure page. If sufficient,
  inventory is decremented and the user is redirected to a Success page.
- `Success.html` and `Failure.html` are outcome pages for a purchase action.

**Sample data**
- Startup logic seeds 6 sample `InHousePart` objects and 5 sample
  `Product` tiers, guarded by a check against the repositories so sample
  data isn't duplicated on repeated deployments.

## Key Features
- Purchase flow with real-time inventory validation and Success/Failure
  redirects
- Custom min/max inventory constraints with descriptive validation error
  messages (preventing updates that would drop inventory below the
  allowed minimum)
- Sample data seeding (safe across repeated app restarts)
- Min/max inventory tracking surfaced in the UI (added table columns and
  fields for min/max values)

## Testing
- Unit tests verifying getter/setter behavior for min/max inventory
  values on both `InHousePart` and `OutsourcedPart`