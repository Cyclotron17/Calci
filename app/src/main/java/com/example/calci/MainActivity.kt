package com.example.calci

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calci.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.AC.setOnClickListener {
            binding.operation.text=""
            binding.result.text=""
        }
        binding.zero.setOnClickListener {
            binding.operation.append("0")
        }
        binding.one.setOnClickListener {
            binding.operation.append("1")
        }
        binding.two.setOnClickListener {
            binding.operation.append("2")
        }
        binding.three.setOnClickListener {
            binding.operation.append("3")
        }
        binding.four.setOnClickListener {
            binding.operation.append("4")
        }
        binding.five.setOnClickListener {
            binding.operation.append("5")
        }
        binding.six.setOnClickListener {
            binding.operation.append("6")
        }
        binding.seven.setOnClickListener {
            binding.operation.append("7")
        }
        binding.eight.setOnClickListener {
            binding.operation.append("8")
        }
        binding.nine.setOnClickListener {
            binding.operation.append("9")
        }
        binding.add.setOnClickListener {
            binding.operation.append("+")
        }
        binding.minus.setOnClickListener {
            binding.operation.append("-")
        }
        binding.multiply.setOnClickListener {
            binding.operation.append("*")
        }
        binding.divide.setOnClickListener {
            binding.operation.append("/")
        }
        binding.sbracket.setOnClickListener {
            binding.operation.append("(")
        }
        binding.ebracket.setOnClickListener {
            binding.operation.append(")")
        }
        binding.dot.setOnClickListener {
            binding.operation.append(".")
        }
        binding.clear.setOnClickListener {
            val len = binding.operation.length()
            if (len > 0) {
                binding.operation.text = binding.operation.text.subSequence(0, len - 1)

            }
        }
            binding.equals.setOnClickListener {
               val exp=ExpressionBuilder(binding.operation.text.toString()).build()
                val res=exp.evaluate()
                val Longres=res.toLong()
                if (res==Longres.toDouble())
                {
                    binding.result.text= Longres.toString()

                }
                else {
                    binding.result.text = res.toString()
                }


            }

        }








    }
