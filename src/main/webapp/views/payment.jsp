<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Payment Page</title>
<link rel="stylesheet" href="css/style.css">
<style>
body {
  background-image: url('img/payment.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed; 
  background-size: 100% 100%
}
</style>
</head>
<body>
<Center>
<div class="container">
  <h1>Payment Information</h1>
  
  <!-- Payment Method Selection -->
  <div class="payment-methods">
    <label for="payment-method">Select Payment Method:</label>
    <select id="payment-method">
      <option value="upi">UPI</option>
      <option value="card">Credit/Debit Card</option>
    </select>
  </div>
  
  <!-- UPI Payment Form -->
  <div id="upi-payment" class="payment-form">
    <h2>UPI Payment</h2>
    <form action="index.jsp">
      <label for="upi-id">UPI ID:</label>
      <input type="text" id="upi-id" name="upi-id" required>
      <button type="submit">Pay with UPI</button><br><br><br><br>
      <!-- Placeholder for QR Code -->
    <div class="qr-code-placeholder">
      <img src="img/QrCode.png" alt="QR Code Placeholder">
      
    </div>
    </form>
  </div>
  
  <!-- Card Payment Form -->
  <div id="card-payment" class="payment-form" style="display: none;">
    <h2>Credit/Debit Card Payment</h2>
    <form>
      <label for="card-number">Card Number:</label>
      <input type="text" id="card-number" name="card-number" required>
      <br><br>
      <label for="expiry">Expiry Date:</label>
      <input type="text" id="expiry" name="expiry" placeholder="MM/YYYY" required>
      <br><br>
      <label for="cvv">CVV:</label>
      <input type="text" id="cvv" name="cvv" required>
      <br><br>
      <button type="submit">Pay with Card</button>
      
    </form>
  </div>
</div>

<script src="js/Script.js"></script>
</Center>
</body>
</html>
