# Jenkins Setup Instructions

## Option 1: Use Jenkins with Maven Pre-installed (RECOMMENDED)

1. **Stop current Jenkins container:**
   ```
   docker stop jenkins
   docker rm jenkins
   ```

2. **Build new Jenkins image with Maven:**
   ```
   docker build -f jenkins-with-maven.dockerfile -t jenkins-maven .
   ```

3. **Start new Jenkins with Maven:**
   ```
   docker run -d --name jenkins-maven -p 8080:8080 -p 50000:50000 -v /var/run/docker.sock:/var/run/docker.sock jenkins-maven
   ```

4. **Access Jenkins at http://localhost:8080**

5. **Get initial admin password:**
   ```
   docker logs jenkins-maven
   ```
   Look for the password in the logs.

6. **Complete Jenkins setup wizard** (install suggested plugins, create admin user)

7. **Create new Pipeline job:**
   - New Item → Pipeline
   - Under "Pipeline", select "Pipeline script from SCM"
   - SCM: Git
   - Repository URL: https://github.com/miska-voutilainen/TemperatureConverter/
   - Save

8. **Click "Build Now"**

## Option 2: Configure Maven in Current Jenkins

1. **Go to Jenkins dashboard**

2. **Manage Jenkins → Global Tool Configuration**

3. **Under "Maven" section:**
   - Click "Add Maven"
   - Name: `Maven`
   - Check "Install automatically"
   - Save

4. **Go back to your pipeline job and rebuild**

## To Test Locally (without Jenkins)

Run the build script:
```bash
chmod +x build.sh
./build.sh
```

Or run commands manually:
```bash
mvn clean test package
docker build -t temperatureconverter .
```

## To Test the App
```bash
docker run -it temperatureconverter
```

## What You Need for Assignment Submission

After successful Jenkins run:
1. Screenshot of pipeline stages (green checkmarks)
2. JaCoCo coverage report (accessible from Jenkins job page)
3. Docker image tested locally or on play-with-docker.com