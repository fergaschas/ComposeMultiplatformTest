package com.fgascon.todotest.di

import com.fgascon.todotest.core.ui.HomeViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

expect val platformModule: Module


val sharedModule = module {
    viewModelOf(::HomeViewModel)
    //singleOf(::TestRepository)).bind<LocalDataSource>()
}