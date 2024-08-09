document.addEventListener("DOMContentLoaded", function() {
  const paymentMethodSelect = document.getElementById("payment-method");
  const upiPaymentForm = document.getElementById("upi-payment");
  const cardPaymentForm = document.getElementById("card-payment");

  // Toggle between UPI and Card payment forms based on selection
  paymentMethodSelect.addEventListener("change", function() {
    if (paymentMethodSelect.value === "upi") {
      upiPaymentForm.style.display = "block";
      cardPaymentForm.style.display = "none";
    } else if (paymentMethodSelect.value === "card") {
      upiPaymentForm.style.display = "none";
      cardPaymentForm.style.display = "block";
    }
  });
});
