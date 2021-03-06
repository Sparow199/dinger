package app.crash

import dagger.Module
import dagger.Provides
import reporter.CrashReporter
import reporter.CrashReporters
import javax.inject.Singleton

@Module
internal class VoidCrashReporterModule {
    @Provides
    @Singleton
    fun instance(): CrashReporter = CrashReporters.void()
}
