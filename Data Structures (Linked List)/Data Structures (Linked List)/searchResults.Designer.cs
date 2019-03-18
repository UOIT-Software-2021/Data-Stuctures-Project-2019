namespace Data_Structures__Linked_List_
{
    partial class searchResults
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.grpBoxResults = new System.Windows.Forms.GroupBox();
            this.txtBoxResults = new System.Windows.Forms.TextBox();
            this.grpBoxResults.SuspendLayout();
            this.SuspendLayout();
            // 
            // grpBoxResults
            // 
            this.grpBoxResults.Controls.Add(this.txtBoxResults);
            this.grpBoxResults.Location = new System.Drawing.Point(13, 13);
            this.grpBoxResults.Name = "grpBoxResults";
            this.grpBoxResults.Size = new System.Drawing.Size(861, 621);
            this.grpBoxResults.TabIndex = 0;
            this.grpBoxResults.TabStop = false;
            this.grpBoxResults.Text = "Key:";
            // 
            // txtBoxResults
            // 
            this.txtBoxResults.Location = new System.Drawing.Point(7, 30);
            this.txtBoxResults.Multiline = true;
            this.txtBoxResults.Name = "txtBoxResults";
            this.txtBoxResults.ReadOnly = true;
            this.txtBoxResults.Size = new System.Drawing.Size(848, 585);
            this.txtBoxResults.TabIndex = 0;
            // 
            // searchResults
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(12F, 25F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(886, 646);
            this.Controls.Add(this.grpBoxResults);
            this.Name = "searchResults";
            this.Text = "Search Results";
            this.Load += new System.EventHandler(this.SearchResults_Load);
            this.grpBoxResults.ResumeLayout(false);
            this.grpBoxResults.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox grpBoxResults;
        private System.Windows.Forms.TextBox txtBoxResults;
    }
}