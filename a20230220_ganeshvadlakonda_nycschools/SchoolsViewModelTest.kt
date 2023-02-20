package com.example.a20230220_ganeshvadlakonda_nycschools

import junit.framework.TestCase.assertNotNull
import kotlinx.coroutines.runBlocking
import org.junit.Test

class SchoolsViewModelTest {

    @Test
    fun testCheckSchoolsNotNull() = runBlocking {
        val schoolViewModel = SchoolsViewModel()
        val schools = schoolViewModel.getSchoolsList()
        assertNotNull(schools)
    }

    @Test
    fun testCheckSchoolDetails() = runBlocking {
        val schoolViewModel = SchoolsViewModel()
        val schoolDetails = schoolViewModel.getSchoolDetails()
        assertNotNull(schoolDetails)
    }
}