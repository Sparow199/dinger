package data.autoswipe

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
internal class GetRecommendationsActionModule {
    @Provides
    @Singleton
    fun getRecommendationsAction() = GetRecommendationsAction()
}
