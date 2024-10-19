    @Override
    public void onBackPressed() {

        new AlertDialog.Builder(this)
                .setTitle("Exit App")
                .setIcon(R.drawable.logo2)
                .setMessage("Are you sure you want to exit?")
                .setPositiveButton("Yes", (dialog, which) -> {
                    super.onBackPressed();
                    finish();
                })
                .setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                })
                .setCancelable(true)
                .show();
    }
