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
    /// Details over fouten in opgegeven parameters
    /// </summary>
    [DataContract]
    public partial class InvalidParams :  IEquatable<InvalidParams>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InvalidParams" /> class.
        /// </summary>
        /// <param name="type">type.</param>
        /// <param name="name">Naam van de parameter.</param>
        /// <param name="code">Systeemcode die het type fout aangeeft.</param>
        /// <param name="reason">Beschrijving van de fout op de parameterwaarde.</param>
        public InvalidParams(string type = default(string), string name = default(string), string code = default(string), string reason = default(string))
        {
            this.Type = type;
            this.Name = name;
            this.Code = code;
            this.Reason = reason;
        }
        
        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Naam van de parameter
        /// </summary>
        /// <value>Naam van de parameter</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Systeemcode die het type fout aangeeft
        /// </summary>
        /// <value>Systeemcode die het type fout aangeeft</value>
        [DataMember(Name="code", EmitDefaultValue=false)]
        public string Code { get; set; }

        /// <summary>
        /// Beschrijving van de fout op de parameterwaarde
        /// </summary>
        /// <value>Beschrijving van de fout op de parameterwaarde</value>
        [DataMember(Name="reason", EmitDefaultValue=false)]
        public string Reason { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InvalidParams {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Reason: ").Append(Reason).Append("\n");
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
            return this.Equals(input as InvalidParams);
        }

        /// <summary>
        /// Returns true if InvalidParams instances are equal
        /// </summary>
        /// <param name="input">Instance of InvalidParams to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InvalidParams input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Code == input.Code ||
                    (this.Code != null &&
                    this.Code.Equals(input.Code))
                ) && 
                (
                    this.Reason == input.Reason ||
                    (this.Reason != null &&
                    this.Reason.Equals(input.Reason))
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
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Code != null)
                    hashCode = hashCode * 59 + this.Code.GetHashCode();
                if (this.Reason != null)
                    hashCode = hashCode * 59 + this.Reason.GetHashCode();
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

            // Code (string) minLength
            if(this.Code != null && this.Code.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Code, length must be greater than 1.", new [] { "Code" });
            }
            
            yield break;
        }
    }

}
