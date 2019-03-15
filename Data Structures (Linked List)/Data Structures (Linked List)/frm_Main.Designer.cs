namespace Data_Structures__Linked_List_
{
    partial class frm_Main
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
            this.grpBoxOperations = new System.Windows.Forms.GroupBox();
            this.btnClear = new System.Windows.Forms.Button();
            this.btnExecute = new System.Windows.Forms.Button();
            this.rdoBtnRemove = new System.Windows.Forms.RadioButton();
            this.label2 = new System.Windows.Forms.Label();
            this.txtBoxValue = new System.Windows.Forms.TextBox();
            this.rdoBtnAdd = new System.Windows.Forms.RadioButton();
            this.label1 = new System.Windows.Forms.Label();
            this.txtBoxKey = new System.Windows.Forms.TextBox();
            this.grpBoxVisualization = new System.Windows.Forms.GroupBox();
            this.rdoBtnSearch = new System.Windows.Forms.RadioButton();
            this.grpBoxOperations.SuspendLayout();
            this.SuspendLayout();
            // 
            // grpBoxOperations
            // 
            this.grpBoxOperations.Controls.Add(this.rdoBtnSearch);
            this.grpBoxOperations.Controls.Add(this.btnClear);
            this.grpBoxOperations.Controls.Add(this.btnExecute);
            this.grpBoxOperations.Controls.Add(this.rdoBtnRemove);
            this.grpBoxOperations.Controls.Add(this.label2);
            this.grpBoxOperations.Controls.Add(this.txtBoxValue);
            this.grpBoxOperations.Controls.Add(this.rdoBtnAdd);
            this.grpBoxOperations.Controls.Add(this.label1);
            this.grpBoxOperations.Controls.Add(this.txtBoxKey);
            this.grpBoxOperations.Location = new System.Drawing.Point(12, 12);
            this.grpBoxOperations.Name = "grpBoxOperations";
            this.grpBoxOperations.Size = new System.Drawing.Size(399, 525);
            this.grpBoxOperations.TabIndex = 0;
            this.grpBoxOperations.TabStop = false;
            this.grpBoxOperations.Text = "Operations";
            this.grpBoxOperations.Enter += new System.EventHandler(this.GroupBox1_Enter);
            // 
            // btnClear
            // 
            this.btnClear.Location = new System.Drawing.Point(114, 448);
            this.btnClear.Name = "btnClear";
            this.btnClear.Size = new System.Drawing.Size(124, 45);
            this.btnClear.TabIndex = 7;
            this.btnClear.Text = "Clear";
            this.btnClear.UseVisualStyleBackColor = true;
            this.btnClear.Click += new System.EventHandler(this.BtnClear_Click);
            // 
            // btnExecute
            // 
            this.btnExecute.Location = new System.Drawing.Point(114, 387);
            this.btnExecute.Name = "btnExecute";
            this.btnExecute.Size = new System.Drawing.Size(124, 45);
            this.btnExecute.TabIndex = 6;
            this.btnExecute.Text = "Execute";
            this.btnExecute.UseVisualStyleBackColor = true;
            // 
            // rdoBtnRemove
            // 
            this.rdoBtnRemove.AutoSize = true;
            this.rdoBtnRemove.Location = new System.Drawing.Point(20, 264);
            this.rdoBtnRemove.Name = "rdoBtnRemove";
            this.rdoBtnRemove.Size = new System.Drawing.Size(122, 29);
            this.rdoBtnRemove.TabIndex = 5;
            this.rdoBtnRemove.TabStop = true;
            this.rdoBtnRemove.Text = "Remove";
            this.rdoBtnRemove.UseVisualStyleBackColor = true;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(15, 126);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(67, 25);
            this.label2.TabIndex = 4;
            this.label2.Text = "Value";
            // 
            // txtBoxValue
            // 
            this.txtBoxValue.Location = new System.Drawing.Point(20, 154);
            this.txtBoxValue.Name = "txtBoxValue";
            this.txtBoxValue.Size = new System.Drawing.Size(356, 31);
            this.txtBoxValue.TabIndex = 3;
            // 
            // rdoBtnAdd
            // 
            this.rdoBtnAdd.AutoSize = true;
            this.rdoBtnAdd.Location = new System.Drawing.Point(20, 214);
            this.rdoBtnAdd.Name = "rdoBtnAdd";
            this.rdoBtnAdd.Size = new System.Drawing.Size(81, 29);
            this.rdoBtnAdd.TabIndex = 2;
            this.rdoBtnAdd.TabStop = true;
            this.rdoBtnAdd.Text = "Add";
            this.rdoBtnAdd.UseVisualStyleBackColor = true;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(15, 51);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(49, 25);
            this.label1.TabIndex = 1;
            this.label1.Text = "Key";
            this.label1.Click += new System.EventHandler(this.Label1_Click);
            // 
            // txtBoxKey
            // 
            this.txtBoxKey.Location = new System.Drawing.Point(20, 79);
            this.txtBoxKey.Name = "txtBoxKey";
            this.txtBoxKey.Size = new System.Drawing.Size(356, 31);
            this.txtBoxKey.TabIndex = 0;
            // 
            // grpBoxVisualization
            // 
            this.grpBoxVisualization.Location = new System.Drawing.Point(417, 12);
            this.grpBoxVisualization.Name = "grpBoxVisualization";
            this.grpBoxVisualization.Size = new System.Drawing.Size(570, 525);
            this.grpBoxVisualization.TabIndex = 1;
            this.grpBoxVisualization.TabStop = false;
            this.grpBoxVisualization.Text = "Visualization";
            // 
            // rdoBtnSearch
            // 
            this.rdoBtnSearch.AutoSize = true;
            this.rdoBtnSearch.Location = new System.Drawing.Point(20, 315);
            this.rdoBtnSearch.Name = "rdoBtnSearch";
            this.rdoBtnSearch.Size = new System.Drawing.Size(111, 29);
            this.rdoBtnSearch.TabIndex = 8;
            this.rdoBtnSearch.TabStop = true;
            this.rdoBtnSearch.Text = "Search";
            this.rdoBtnSearch.UseVisualStyleBackColor = true;
            // 
            // frm_Main
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(12F, 25F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(999, 555);
            this.Controls.Add(this.grpBoxVisualization);
            this.Controls.Add(this.grpBoxOperations);
            this.Name = "frm_Main";
            this.Text = "Big-O Linked List";
            this.grpBoxOperations.ResumeLayout(false);
            this.grpBoxOperations.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox grpBoxOperations;
        private System.Windows.Forms.GroupBox grpBoxVisualization;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txtBoxValue;
        private System.Windows.Forms.RadioButton rdoBtnAdd;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txtBoxKey;
        private System.Windows.Forms.RadioButton rdoBtnRemove;
        private System.Windows.Forms.Button btnExecute;
        private System.Windows.Forms.Button btnClear;
        private System.Windows.Forms.RadioButton rdoBtnSearch;
    }
}

