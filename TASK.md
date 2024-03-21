1. Develop a microservice to manage invoices, enabling addition and retrieval functionalities. Assume the invoice entity comprises properties: productId, total, userId, and creation date. Store this data in a database of your preference.
2. Write a minimum of two tests for the controller layer.
3. Since the endpoint for retrieving users is directly accessed by the front end, enhance the response of the invoice retrieval endpoint to include the user's name and last name would be beneficial. This information can be obtained by calling `https://randomuser.me/api/?seed={userId}`.
4. Due to time constraints, the solution may not be flawless. Reflect on aspects you would refine given enough time.