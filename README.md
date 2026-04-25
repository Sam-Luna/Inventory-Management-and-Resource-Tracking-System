# WESTERN GOVERNORS UNIVERSITY - D287

## CHANGES MADE FOR EACH PART OF THE PROJECT.


### C. I made the following changes to the file <b>mainscreen.html</b>:


- Line 15-21: I added a background image to the page. For this I also had to create a separate folder to store the images I will be using on the project. This folder is located in : D287 - Java\images
- Line 24-28: I changed the font and style for headers 1 and 2, and for the search bar.
- Line 33: I changed the background color for < div > and made it less opaque to give the page a more personalized feel, and to help the page not look too saturated due to the background image I chose.
- Line 51-143: I added the names of the parts to the table along with the prices, and changed the background color of the table.
- Line 193-247: I added the names of the proucts and their costs to the table, and changed the background color of the table.

## D. I created a new file <b>about.html</b> and made the following:
- Line 1-12: Initialized file properly and created a <head> section.
- Line 13-137: I created < style > tags and within those tags I edited and formatted the page's contents with CSS, including:
    >- 13-20: I added a and styled the background image for the entire page.
    >- 23-76: background image and color for each container as well as display, padding, positioning and anything needed to format each container.
    >- 81-107: Styling for all the text in the page.
    >- Line 109-133: Styling for the buttons used in the page. I crated 2 that both point to mainscreen.html. I changed the color, the edges, and added effects on hover.

- Line 140-152: I created a container to use as a header for the page title. I also added a "PRODUCT" button that directs the user to mainscreen.
- Line 155-169: I created a container for the first mission statement. This container also has 2 more containers nested inside of it, which I used to style the page and add text.
- Line 173-188: This container is for the second mission statement and also has 2 conatiners nested inside that are used to style the page.
- Line 192-217: This is the container for the third mission statement, fomratted similarly to the previous two statement containers. Within this conntainer I added another button labeled "SHOP NOW!" which directs the user to mainscreen.html.

<b>I also made a change to mainscreen.html</b>:
- Line 277-281: I created a button that directs the user to the ABOUT page.
- Line 109-135: I styled the button I added to the page. I changed the color, the edges, and added effects on hover. 


E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.

F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
• The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

J.  Remove the class files for any unused validators in order to clean your code.