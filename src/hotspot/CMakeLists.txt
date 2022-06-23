cmake_minimum_required(VERSION 3.14) # 这个设置不需要严格对应，自己建个测试项目复制过来这段即可

project(hotspot)

file(GLOB_RECURSE SOURCE_FILES "*.cpp" "*.hpp" "*.c" "*.h")

add_executable(hotspot ${SOURCE_FILES})

include_directories(/share)
include_directories(../../share/)
include_directories(/cpu)
include_directories(/os)
include_directories(/os_cpu)


