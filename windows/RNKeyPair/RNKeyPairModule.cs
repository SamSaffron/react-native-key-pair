using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Com.Reactlibrary.RNKeyPair
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNKeyPairModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNKeyPairModule"/>.
        /// </summary>
        internal RNKeyPairModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNKeyPair";
            }
        }
    }
}
