cmake_minimum_required(VERSION 3.10.2)

add_library(xmrig SHARED IMPORTED)
set_target_properties(xmrig PROPERTIES IMPORTED_LOCATION "${CMAKE_CURRENT_LIST_DIR}/libxmrig.so")

add_executable(android-xmrig src/main/cpp/xmrig_jni.cpp)
target_link_libraries(android-xmrig xmrig log)
