package com.example.movieapp.repository

import com.example.movieapp.data.model.MovieList
import com.example.movieapp.data.remote.MovieDataSource
import javax.sql.DataSource

class MovieRepositoryImpl(private var dataSource: MovieDataSource): MovieRepository {

    override suspend fun getUpcomingMovies(): MovieList = dataSource.getUpcomingMovies()

    override suspend fun getTopRatedMovies(): MovieList = dataSource.getTopRatedMovies()

    override suspend fun getPopularMovies(): MovieList = dataSource.getPopularMovies()
}