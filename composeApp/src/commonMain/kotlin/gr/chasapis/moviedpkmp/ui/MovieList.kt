package gr.chasapis.moviedpkmp.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import gr.chasapis.moviedpkmp.models.MovieDataItem
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
fun MovieList(list: List<MovieDataItem>) {

    LazyColumn {
        items(list.size) { index ->
            MovieItem(item = list[index])
        }
    }

}

@Preview
@Composable
private fun MovieItem(item: MovieDataItem) {

    Box(modifier = Modifier.fillMaxWidth()) {
        AsyncImage(
            model = "https://i0.wp.com/spacenews.com/wp-content/uploads/2025/01/Thuraya-4-scaled.jpg?resize=1200%2C744&ssl=1",
            contentDescription = "Movie poster",
            modifier = Modifier.fillMaxWidth().height(300.dp)
        )

    }
}