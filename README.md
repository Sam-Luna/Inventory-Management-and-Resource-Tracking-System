# WESTERN GOVERNORS UNIVERSITY - D287
## CHANGES MADE FOR EACH PART OF THE PROJECT.


### TASK C. I made the following changes to the file <b>mainscreen.html</b>:


- Line 15-21: I added a background image to the page. For this I also had to create a separate folder to store the images I will be using on the project. This folder is located in : D287 - Java\images
- Line 24-28: I changed the font and style for headers 1 and 2, and for the search bar.
- Line 33: I changed the background color for < div > and made it less opaque to give the page a more personalized feel, and to help the page not look too saturated due to the background image I chose.
- Line 51-143: I added the names of the parts to the table along with the prices, and changed the background color of the table.
- Line 193-247: I added the names of the proucts and their costs to the table, and changed the background color of the table.

### TASK D. I created a new file <b>about.html</b> and made the following:
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


### TASK E. I made the following changes to the file <b>BootStrapData.java</b>:
- Line 44: I created an IF statement that ensures my sample inventory for Inhouse and Oursource parts is only added if the partRepository is empty. This is done to prevent multiplicate items.
- Line 46-51: I created 6 InhousePart objects. I created 6 because my company sells PC components and the InhouseParts are the peripheral components needed for a PC build.
- Line 55-89: I initialized each of the InhousePart objects I created. This was done by setting the id, name, price and inventory for each part. I also saved each one to the partRepository.
- Line 92-97: I created 6 OursourcedPart Objects. These are represented by the internal parts neede to build a PC; from the motherboard to the power supply.
- Line 101-141: I initialized each of the OursourcePart objects I created and also saved each one to the repository.
- Line 145: I created a second IF statement to ensure that my sample Products are only added if the productRepository is empty, to prevent multiplicate items from being added.
- Line 146-159: I created and initialized 5 products representing a tier of PC a consumer can purhase from the company. Each object is created and intialized on the same line, followed by being added to the productRepository.

I also made a change to the <b>mainscreen.html</b> page:
- Line 97-197: When I first started the project, the instructions for part C called for the user interface to include the names of the parts. I did this by copying the existing code that created a row for the parts. I then reused this code to manually add each part needed into the html file to be displayed. However, since part E required me to add these parts using Java, I commented out the blocks of code from part A. 

### TASK F. I made the following changes to the following files:

#### <b>mainscreen.html</b>
- Line 137-138: I created a new button to buy a product next to the update and delete buttons.

#### <b>AddProductController.java</b>
- Line 178: I created a controller to control the behavior of the "buy now" button in the mainscreen. In the controller:
- Line 183: I created an int to hold the inventory value for the product the button references.
- Line 185: I created an IF statement that will direct the user to a "Failure" screen when a product does not have sufficient inventory to complete the purchase.
- Line 197-193: The ELSE part of the IF statement ensures that if there is enough inventory to complete the purchase the user is redirected to a "Success" page. It also ensures that the inventory for the product is decreased by 1.

I also created two new files under the <b>templates</b> folder: <b>Failure.html</b> and <b>Success.html</b>: these are the pages the user will be directed to depending on which conditions are met in the IF statement when pressing the "buy now" button.

### TASK G. I made the following changes to the following files:

#### mainscreen.html:
- Line 82-83: I added 2 new columns to the PC Components table; for the minimum and maximum inventory.
- Line 94-95: I added a field to the existing row to display the min and max inventory.

#### Part.java:
- Line 23: I linked @ValidInventory to ensure InventoryValidator and Part.java can work together.
- Line 33-37: created variables for the min and max values.
- Line 92-103: created getter and setters for the min and max values.

#### BootStrapData.java
- Line 59-163: I added .setMin() and .setMax() to all the parts in the sample inventory.

#### I created file ValidInventory (annotation) and the class InventoryValidator.java to validate min and max inventory:
In InventoryValidator:

- Line 33-41: I created IF statements to make sure the inventory is between the min and max inventory values.
And added constraint validators to ensure an error message was returned to the user when the conditions were not met.

#### Changes for both InhousePartForm.html and OuthousePartForm.html:

- Line 90-96: I added the min and max inventory input fields for the user.
- Line 100-107: I made sure that the page would display a message for the user in case of an error. 
- Line 115-119: I changed the link to the main menu to a button.

<b> I also styled both pages using html to make it look more like the rest of the project. Most of the formatting is reused from mainscreen.html</b>

#### application.properties:
I change the name of the file the persistent storage is saved to every time I make an update.

### TASK H: 
#### The following requirements were met when I completed task G:
- Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
- Display error messages when adding and updating parts if the inventory is greater than the maximum.

#### To display error message for low inventory when adding and updating products lowers the part inventory below the minimum I did the following:
I edited the <b>productForm.html</b> file:
- Line 

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

J.  Remove the class files for any unused validators in order to clean your code.