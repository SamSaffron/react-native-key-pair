
# react-native-key-pair

A native implementation of Public/Private RSA key genaration.

## Usage

```
import KeyPair from 'react-native-key-pair'
KeyPair.generate((keys)=>{
   console.log(keys.private) // the private key
   console.log(keys.public) // the public key
})
```


## Getting started

`$ npm install react-native-key-pair --save`

### Mostly automatic installation

`$ react-native link react-native-key-pair`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-key-pair` and add `RNKeyPair.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNKeyPair.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNKeyPairPackage;` to the imports at the top of the file
  - Add `new RNKeyPairPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-key-pair'
  	project(':react-native-key-pair').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-key-pair/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-key-pair')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNKeyPair.sln` in `node_modules/react-native-key-pair/windows/RNKeyPair.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Cl.Json.RNKeyPair;` to the usings at the top of the file
  - Add `new RNKeyPairPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNKeyPair from 'react-native-key-pair';

// TODO: What do with the module?
RNKeyPair;
```
  
