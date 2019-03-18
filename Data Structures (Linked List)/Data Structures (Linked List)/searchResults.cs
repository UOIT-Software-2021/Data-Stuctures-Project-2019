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
    public partial class searchResults : Form
    {
        public searchResults()
        {
            InitializeComponent();
        }

        public String keyValue
        {
            set
            {
                grpBoxResults.Text = "Key: " + value.ToString();
            }
        }

        private void SearchResults_Load(object sender, EventArgs e)
        {

        }
    }
}
