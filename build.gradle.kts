plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.h2database:h2:2.2.224")
    implementation("org.hibernate.orm:hibernate-core:6.4.4.Final")
    implementation("org.flywaydb:flyway-core:10.10.0")
    implementation("jakarta.validation:jakarta.validation-api:3.1.0-M2")
    compileOnly("org.projectlombok:lombok:1.18.32")
}

tasks.test {
    useJUnitPlatform()
}