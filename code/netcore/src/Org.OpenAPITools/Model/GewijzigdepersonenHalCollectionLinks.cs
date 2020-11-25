/* 
 * BRP Update API
 *
 * Met deze API kun je opvragen welke door jou gevolgde personen zijn gewijzigd in de BRP. Je kunt je abonneren op een persoon die je wilt volgen, en je kunt opvragen welke personen door jou worden gevolgd. Je kunt deze API gebruiken in combinatie met de BRP bevragen API, bijvoorbeeld om lokale kopiegegevens actueel te houden.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// GewijzigdepersonenHalCollectionLinks
    /// </summary>
    [DataContract]
    public partial class GewijzigdepersonenHalCollectionLinks :  IEquatable<GewijzigdepersonenHalCollectionLinks>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GewijzigdepersonenHalCollectionLinks" /> class.
        /// </summary>
        /// <param name="self">self.</param>
        /// <param name="ingeschrevenPersoon">ingeschrevenPersoon.</param>
        public GewijzigdepersonenHalCollectionLinks(HalLink self = default(HalLink), HalLink ingeschrevenPersoon = default(HalLink))
        {
            this.Self = self;
            this.IngeschrevenPersoon = ingeschrevenPersoon;
        }
        
        /// <summary>
        /// Gets or Sets Self
        /// </summary>
        [DataMember(Name="self", EmitDefaultValue=false)]
        public HalLink Self { get; set; }

        /// <summary>
        /// Gets or Sets IngeschrevenPersoon
        /// </summary>
        [DataMember(Name="ingeschrevenPersoon", EmitDefaultValue=false)]
        public HalLink IngeschrevenPersoon { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GewijzigdepersonenHalCollectionLinks {\n");
            sb.Append("  Self: ").Append(Self).Append("\n");
            sb.Append("  IngeschrevenPersoon: ").Append(IngeschrevenPersoon).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as GewijzigdepersonenHalCollectionLinks);
        }

        /// <summary>
        /// Returns true if GewijzigdepersonenHalCollectionLinks instances are equal
        /// </summary>
        /// <param name="input">Instance of GewijzigdepersonenHalCollectionLinks to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GewijzigdepersonenHalCollectionLinks input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Self == input.Self ||
                    (this.Self != null &&
                    this.Self.Equals(input.Self))
                ) && 
                (
                    this.IngeschrevenPersoon == input.IngeschrevenPersoon ||
                    (this.IngeschrevenPersoon != null &&
                    this.IngeschrevenPersoon.Equals(input.IngeschrevenPersoon))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Self != null)
                    hashCode = hashCode * 59 + this.Self.GetHashCode();
                if (this.IngeschrevenPersoon != null)
                    hashCode = hashCode * 59 + this.IngeschrevenPersoon.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
