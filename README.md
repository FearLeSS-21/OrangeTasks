Task1 #final edit
1. a vehicle is going to contain a list of products (transportedProducts), each product of the list is going to be a digital or a physical product
2. vehicle should have a method to print the marketName of all the transported products
3. vehicle should have a method to get the total weight of the products being transported in it
4. vehicle should have a method to get the total price of the products being transported in it
5. vehicle should have a method to get the number of products being transported in it
6. vehicle should have a method to addProduct to the list, this method should add the product to the transportedProducts if the weight of the total transported products doesn't exceed the weightedLoad of the vehicle, other wise throw  an exception "Vehicle can't carry more weight than {weightedLoad}"
7. the user input will be through multiple files that the app should read in order
8. first file contains multiple rows representing vehicles, the file is going to be comma separated lines in this format {vehicleId,vehicleLoad,vehicleType}
9. second file contains multiple rows representing prodcuts, the file is going to be comma separated lines in this format {productId,productType,productMarketName,productPrice,productWeight}, the product weight will only be present if the product type is physical product
10. third file contains multiple rows representing products loaded into vehicles, the file is going to be comma separated lines in this format {vehicleId,productId} where each line is the order in which products will be loaded into the vehicle
11. output after reading files should be one file, the file is going to be comma separated lines in this format {vehicleId,booleanIfThisTruckExceedsTheWeightLimit,totalProductsWeight,totalProductsPrice{productMarketName1,productMarketName2,productMarketName3,productMarketName4...}}, totalProductsWeight, totalProdcutsPrice, and product market names are going to be "N/A" if the truck exceeds the weight limit
