	�p=
ף�?�p=
ף�?!�p=
ף�?	'vb'vb9@'vb'vb9@!'vb'vb9@"e
=type.googleapis.com/tensorflow.profiler.PerGenericStepDetails$�p=
ף�?h��|?5�?Au�V�?YL7�A`��?*	     �v@2d
-Iterator::Model::ParallelMap::Zip[0]::FlatMapNbX9��?!-�-ЂJ@)�z�G�?1��؉��<@:Preprocessing2t
=Iterator::Model::ParallelMap::Zip[0]::FlatMap[4]::Concatenate#��~j��?!�@�@6@){�G�z�?1�_��_�5@:Preprocessing2F
Iterator::Model��ʡE�?!k��j��7@)���x�&�?1�h�h2@:Preprocessing2�
JIterator::Model::ParallelMap::Zip[0]::FlatMap::Prefetch::Map::FiniteRepeat���x�&�?!�h�h2@)����Mb�?1R�Q�1@:Preprocessing2S
Iterator::Model::ParallelMap{�G�z�?!�_��_�@){�G�z�?1�_��_�@:Preprocessing2j
3Iterator::Model::ParallelMap::Zip[1]::ForeverRepeat���Q��?!��{��{@)���Q��?1��{��{@:Preprocessing2n
7Iterator::Model::ParallelMap::Zip[0]::FlatMap::Prefetchy�&1�|?!O��N���?)y�&1�|?1O��N���?:Preprocessing2�
QIterator::Model::ParallelMap::Zip[0]::FlatMap::Prefetch::Map::FiniteRepeat::Range�~j�t�h?!��_��_�?)�~j�t�h?1��_��_�?:Preprocessing2�
LIterator::Model::ParallelMap::Zip[0]::FlatMap[4]::Concatenate[1]::FromTensor����MbP?!R�Q��?)����MbP?1R�Q��?:Preprocessing2�
MIterator::Model::ParallelMap::Zip[0]::FlatMap[5]::Concatenate[0]::TensorSlice����MbP?!R�Q��?)����MbP?1R�Q��?:Preprocessing2�
LIterator::Model::ParallelMap::Zip[0]::FlatMap[5]::Concatenate[1]::FromTensor����MbP?!R�Q��?)����MbP?1R�Q��?:Preprocessing2R
?Iterator::Model::ParallelMap::Zip[1]::ForeverRepeat::FromTensor:Preprocessing:�
]Enqueuing data: you may want to combine small input data chunks into fewer but larger chunks.
�Data preprocessing: you may increase num_parallel_calls in <a href="https://www.tensorflow.org/api_docs/python/tf/data/Dataset#map" target="_blank">Dataset map()</a> or preprocess the data OFFLINE.
�Reading data from files in advance: you may tune parameters in the following tf.data API (<a href="https://www.tensorflow.org/api_docs/python/tf/data/Dataset#prefetch" target="_blank">prefetch size</a>, <a href="https://www.tensorflow.org/api_docs/python/tf/data/Dataset#interleave" target="_blank">interleave cycle_length</a>, <a href="https://www.tensorflow.org/api_docs/python/tf/data/TFRecordDataset#class_tfrecorddataset" target="_blank">reader buffer_size</a>)
�Reading data from files on demand: you should read data IN ADVANCE using the following tf.data API (<a href="https://www.tensorflow.org/api_docs/python/tf/data/Dataset#prefetch" target="_blank">prefetch</a>, <a href="https://www.tensorflow.org/api_docs/python/tf/data/Dataset#interleave" target="_blank">interleave</a>, <a href="https://www.tensorflow.org/api_docs/python/tf/data/TFRecordDataset#class_tfrecorddataset" target="_blank">reader buffer</a>)
�Other data reading or processing: you may consider using the <a href="https://www.tensorflow.org/programmers_guide/datasets" target="_blank">tf.data API</a> (if you are not using it now)�
:type.googleapis.com/tensorflow.profiler.BottleneckAnalysis�
host�Your program is HIGHLY input-bound because 25.4% of the total step time sampled is waiting for input. Therefore, you should first focus on reducing the input time.no*moderate2B11.3 % of the total step time sampled is spent on All Others time.>Look at Section 3 for the breakdown of input time on the host.B�
@type.googleapis.com/tensorflow.profiler.GenericStepTimeBreakdown�
	h��|?5�?h��|?5�?!h��|?5�?      ��!       "      ��!       *      ��!       2	u�V�?u�V�?!u�V�?:      ��!       B      ��!       J	L7�A`��?L7�A`��?!L7�A`��?R      ��!       Z	L7�A`��?L7�A`��?!L7�A`��?JCPU_ONLY