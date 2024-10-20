
import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomePageActivity : AppCompatActivity() {

    private lateinit var categoryRecyclerView: RecyclerView
    private lateinit var productRecyclerView: RecyclerView
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        // Initialize RecyclerViews
        categoryRecyclerView = findViewById(R.id.categoryRecyclerView)
        productRecyclerView = findViewById(R.id.productRecyclerView)
        bottomNavigationView = findViewById(R.id.bottomNavigation)

        // Set layout managers and adapters
        categoryRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        productRecyclerView.layoutManager = GridLayoutManager(this, 2)

        // Set up adapters for RecyclerViews
        val categoryAdapter = CategoryAdapter(getCategories())
        val productAdapter = ProductAdapter(getProducts())

        categoryRecyclerView.adapter = categoryAdapter
        productRecyclerView.adapter = productAdapter

        // Bottom Navigation setup
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_for_you -> {
                    // Handle "For You" navigation
                    true
                }
                R.id.navigation_messages -> {
                    // Handle "Messages" navigation
                    true
                }
                R.id.navigation_cart -> {
                    // Handle "Cart" navigation
                    true
                }
                R.id.navigation_account -> {
                    // Handle "Account" navigation
                    true
                }
                else -> false
            }
        }
    }

    // Sample data for categories
    private fun getCategories(): List<Category> {
        return listOf(
            Category("Gift bags", R.drawable.ic_gift),
            Category("Dresses", R.drawable.ic_dresses),
            Category("Jewellery Boxes", R.drawable.ic_jewellery),
            // Add more categories as needed
        )
    }

    // Sample data for products
    private fun getProducts(): List<Product> {
        return listOf(
            Product("Rs. 480", R.drawable.ic_product_1),
            Product("Rs. 478", R.drawable.ic_product_2),
            Product("Rs. 216", R.drawable.ic_product_3),
            // Add more products as needed
        )
    }
}
