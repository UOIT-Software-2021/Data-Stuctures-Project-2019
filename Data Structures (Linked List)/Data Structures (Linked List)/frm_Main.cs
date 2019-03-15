using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Data_Structures__Linked_List_
{
    public partial class frm_Main : Form
    {
        private searchResults results;
        public frm_Main()
        {
            InitializeComponent();
            
        }

        private void GroupBox1_Enter(object sender, EventArgs e)
        {

        }

        private void Label1_Click(object sender, EventArgs e)
        {
            if (rdoBtnSearch.Checked)
            {
                results.Show();
            }
        }

        private void BtnClear_Click(object sender, EventArgs e)
        {
            txtBoxKey.Text = "";
            txtBoxValue.Text = "";
            rdoBtnAdd.Checked = false;
            rdoBtnRemove.Checked = false;
            rdoBtnSearch.Checked = false;
        }
    }
}
