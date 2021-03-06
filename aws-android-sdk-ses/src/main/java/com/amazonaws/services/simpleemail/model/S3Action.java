/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * When included in a receipt rule, this action saves the received
 * message to an Amazon Simple Storage Service (Amazon S3) bucket and,
 * optionally, publishes a notification to Amazon Simple Notification
 * Service (Amazon SNS).
 * </p>
 * <p>
 * To enable Amazon SES to write emails to your Amazon S3 bucket, use an
 * AWS KMS key to encrypt your emails, or publish to an Amazon SNS topic
 * of another account, Amazon SES must have permission to access those
 * resources. For information about giving permissions, see the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html"> Amazon SES Developer Guide </a>
 * .
 * </p>
 * <p>
 * <b>NOTE:</b>When you save your emails to an Amazon S3 bucket, the
 * maximum email size (including headers) is 30 MB. Emails larger than
 * that will bounce.
 * </p>
 * <p>
 * For information about specifying Amazon S3 actions in receipt rules,
 * see the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-s3.html"> Amazon SES Developer Guide </a>
 * .
 * </p>
 */
public class S3Action implements Serializable {

    /**
     * The ARN of the Amazon SNS topic to notify when the message is saved to
     * the Amazon S3 bucket. An example of an Amazon SNS topic ARN is
     * <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     * information about Amazon SNS topics, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     * SNS Developer Guide</a>.
     */
    private String topicArn;

    /**
     * The name of the Amazon S3 bucket to which to save the received email.
     */
    private String bucketName;

    /**
     * The key prefix of the Amazon S3 bucket. The key prefix is similar to a
     * directory name that enables you to store similar data under the same
     * directory in a bucket.
     */
    private String objectKeyPrefix;

    /**
     * The customer master key that Amazon SES should use to encrypt your
     * emails before saving them to the Amazon S3 bucket. You can use the
     * default master key or a custom master key you created in AWS KMS as
     * follows: <ul> <li>To use the default master key, provide an ARN in the
     * form of
     * <code>arn:aws:kms:REGION:ACCOUNT-ID-WITHOUT-HYPHENS:alias/aws/ses</code>.
     * For example, if your AWS account ID is 123456789012 and you want to
     * use the default master key in the US West (Oregon) region, the ARN of
     * the default master key would be
     * <code>arn:aws:kms:us-west-2:123456789012:alias/aws/ses</code>. If you
     * use the default master key, you don't need to perform any extra steps
     * to give Amazon SES permission to use the key.</li> <li>To use a custom
     * master key you created in AWS KMS, provide the ARN of the master key
     * and ensure that you add a statement to your key's policy to give
     * Amazon SES permission to use it. For more information about giving
     * permissions, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon
     * SES Developer Guide</a>.</li> </ul> <p>For more information about key
     * policies, see the <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS
     * KMS Developer Guide</a>. If you do not specify a master key, Amazon
     * SES will not encrypt your emails. <important>Your mail is encrypted by
     * Amazon SES using the Amazon S3 encryption client before the mail is
     * submitted to Amazon S3 for storage. It is not encrypted using Amazon
     * S3 server-side encryption. This means that you must use the Amazon S3
     * encryption client to decrypt the email after retrieving it from Amazon
     * S3, as the service has no access to use your AWS KMS keys for
     * decryption. This encryption client is currently available with the <a
     * href="https://aws.amazon.com/sdk-for-java/">AWS Java SDK</a> and <a
     * href="https://aws.amazon.com/sdk-for-ruby/">AWS Ruby SDK</a> only. For
     * more information about client-side encryption using AWS KMS master
     * keys, see the <a
     * href="http://alpha-docs-aws.amazon.com/AmazonS3/latest/dev/UsingClientSideEncryption.html">Amazon
     * S3 Developer Guide</a>. </important>
     */
    private String kmsKeyArn;

    /**
     * The ARN of the Amazon SNS topic to notify when the message is saved to
     * the Amazon S3 bucket. An example of an Amazon SNS topic ARN is
     * <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     * information about Amazon SNS topics, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     * SNS Developer Guide</a>.
     *
     * @return The ARN of the Amazon SNS topic to notify when the message is saved to
     *         the Amazon S3 bucket. An example of an Amazon SNS topic ARN is
     *         <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     *         information about Amazon SNS topics, see the <a
     *         href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     *         SNS Developer Guide</a>.
     */
    public String getTopicArn() {
        return topicArn;
    }
    
    /**
     * The ARN of the Amazon SNS topic to notify when the message is saved to
     * the Amazon S3 bucket. An example of an Amazon SNS topic ARN is
     * <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     * information about Amazon SNS topics, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     * SNS Developer Guide</a>.
     *
     * @param topicArn The ARN of the Amazon SNS topic to notify when the message is saved to
     *         the Amazon S3 bucket. An example of an Amazon SNS topic ARN is
     *         <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     *         information about Amazon SNS topics, see the <a
     *         href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     *         SNS Developer Guide</a>.
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }
    
    /**
     * The ARN of the Amazon SNS topic to notify when the message is saved to
     * the Amazon S3 bucket. An example of an Amazon SNS topic ARN is
     * <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     * information about Amazon SNS topics, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     * SNS Developer Guide</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param topicArn The ARN of the Amazon SNS topic to notify when the message is saved to
     *         the Amazon S3 bucket. An example of an Amazon SNS topic ARN is
     *         <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     *         information about Amazon SNS topics, see the <a
     *         href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     *         SNS Developer Guide</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public S3Action withTopicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
     * The name of the Amazon S3 bucket to which to save the received email.
     *
     * @return The name of the Amazon S3 bucket to which to save the received email.
     */
    public String getBucketName() {
        return bucketName;
    }
    
    /**
     * The name of the Amazon S3 bucket to which to save the received email.
     *
     * @param bucketName The name of the Amazon S3 bucket to which to save the received email.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }
    
    /**
     * The name of the Amazon S3 bucket to which to save the received email.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bucketName The name of the Amazon S3 bucket to which to save the received email.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public S3Action withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * The key prefix of the Amazon S3 bucket. The key prefix is similar to a
     * directory name that enables you to store similar data under the same
     * directory in a bucket.
     *
     * @return The key prefix of the Amazon S3 bucket. The key prefix is similar to a
     *         directory name that enables you to store similar data under the same
     *         directory in a bucket.
     */
    public String getObjectKeyPrefix() {
        return objectKeyPrefix;
    }
    
    /**
     * The key prefix of the Amazon S3 bucket. The key prefix is similar to a
     * directory name that enables you to store similar data under the same
     * directory in a bucket.
     *
     * @param objectKeyPrefix The key prefix of the Amazon S3 bucket. The key prefix is similar to a
     *         directory name that enables you to store similar data under the same
     *         directory in a bucket.
     */
    public void setObjectKeyPrefix(String objectKeyPrefix) {
        this.objectKeyPrefix = objectKeyPrefix;
    }
    
    /**
     * The key prefix of the Amazon S3 bucket. The key prefix is similar to a
     * directory name that enables you to store similar data under the same
     * directory in a bucket.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param objectKeyPrefix The key prefix of the Amazon S3 bucket. The key prefix is similar to a
     *         directory name that enables you to store similar data under the same
     *         directory in a bucket.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public S3Action withObjectKeyPrefix(String objectKeyPrefix) {
        this.objectKeyPrefix = objectKeyPrefix;
        return this;
    }

    /**
     * The customer master key that Amazon SES should use to encrypt your
     * emails before saving them to the Amazon S3 bucket. You can use the
     * default master key or a custom master key you created in AWS KMS as
     * follows: <ul> <li>To use the default master key, provide an ARN in the
     * form of
     * <code>arn:aws:kms:REGION:ACCOUNT-ID-WITHOUT-HYPHENS:alias/aws/ses</code>.
     * For example, if your AWS account ID is 123456789012 and you want to
     * use the default master key in the US West (Oregon) region, the ARN of
     * the default master key would be
     * <code>arn:aws:kms:us-west-2:123456789012:alias/aws/ses</code>. If you
     * use the default master key, you don't need to perform any extra steps
     * to give Amazon SES permission to use the key.</li> <li>To use a custom
     * master key you created in AWS KMS, provide the ARN of the master key
     * and ensure that you add a statement to your key's policy to give
     * Amazon SES permission to use it. For more information about giving
     * permissions, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon
     * SES Developer Guide</a>.</li> </ul> <p>For more information about key
     * policies, see the <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS
     * KMS Developer Guide</a>. If you do not specify a master key, Amazon
     * SES will not encrypt your emails. <important>Your mail is encrypted by
     * Amazon SES using the Amazon S3 encryption client before the mail is
     * submitted to Amazon S3 for storage. It is not encrypted using Amazon
     * S3 server-side encryption. This means that you must use the Amazon S3
     * encryption client to decrypt the email after retrieving it from Amazon
     * S3, as the service has no access to use your AWS KMS keys for
     * decryption. This encryption client is currently available with the <a
     * href="https://aws.amazon.com/sdk-for-java/">AWS Java SDK</a> and <a
     * href="https://aws.amazon.com/sdk-for-ruby/">AWS Ruby SDK</a> only. For
     * more information about client-side encryption using AWS KMS master
     * keys, see the <a
     * href="http://alpha-docs-aws.amazon.com/AmazonS3/latest/dev/UsingClientSideEncryption.html">Amazon
     * S3 Developer Guide</a>. </important>
     *
     * @return The customer master key that Amazon SES should use to encrypt your
     *         emails before saving them to the Amazon S3 bucket. You can use the
     *         default master key or a custom master key you created in AWS KMS as
     *         follows: <ul> <li>To use the default master key, provide an ARN in the
     *         form of
     *         <code>arn:aws:kms:REGION:ACCOUNT-ID-WITHOUT-HYPHENS:alias/aws/ses</code>.
     *         For example, if your AWS account ID is 123456789012 and you want to
     *         use the default master key in the US West (Oregon) region, the ARN of
     *         the default master key would be
     *         <code>arn:aws:kms:us-west-2:123456789012:alias/aws/ses</code>. If you
     *         use the default master key, you don't need to perform any extra steps
     *         to give Amazon SES permission to use the key.</li> <li>To use a custom
     *         master key you created in AWS KMS, provide the ARN of the master key
     *         and ensure that you add a statement to your key's policy to give
     *         Amazon SES permission to use it. For more information about giving
     *         permissions, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon
     *         SES Developer Guide</a>.</li> </ul> <p>For more information about key
     *         policies, see the <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS
     *         KMS Developer Guide</a>. If you do not specify a master key, Amazon
     *         SES will not encrypt your emails. <important>Your mail is encrypted by
     *         Amazon SES using the Amazon S3 encryption client before the mail is
     *         submitted to Amazon S3 for storage. It is not encrypted using Amazon
     *         S3 server-side encryption. This means that you must use the Amazon S3
     *         encryption client to decrypt the email after retrieving it from Amazon
     *         S3, as the service has no access to use your AWS KMS keys for
     *         decryption. This encryption client is currently available with the <a
     *         href="https://aws.amazon.com/sdk-for-java/">AWS Java SDK</a> and <a
     *         href="https://aws.amazon.com/sdk-for-ruby/">AWS Ruby SDK</a> only. For
     *         more information about client-side encryption using AWS KMS master
     *         keys, see the <a
     *         href="http://alpha-docs-aws.amazon.com/AmazonS3/latest/dev/UsingClientSideEncryption.html">Amazon
     *         S3 Developer Guide</a>. </important>
     */
    public String getKmsKeyArn() {
        return kmsKeyArn;
    }
    
    /**
     * The customer master key that Amazon SES should use to encrypt your
     * emails before saving them to the Amazon S3 bucket. You can use the
     * default master key or a custom master key you created in AWS KMS as
     * follows: <ul> <li>To use the default master key, provide an ARN in the
     * form of
     * <code>arn:aws:kms:REGION:ACCOUNT-ID-WITHOUT-HYPHENS:alias/aws/ses</code>.
     * For example, if your AWS account ID is 123456789012 and you want to
     * use the default master key in the US West (Oregon) region, the ARN of
     * the default master key would be
     * <code>arn:aws:kms:us-west-2:123456789012:alias/aws/ses</code>. If you
     * use the default master key, you don't need to perform any extra steps
     * to give Amazon SES permission to use the key.</li> <li>To use a custom
     * master key you created in AWS KMS, provide the ARN of the master key
     * and ensure that you add a statement to your key's policy to give
     * Amazon SES permission to use it. For more information about giving
     * permissions, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon
     * SES Developer Guide</a>.</li> </ul> <p>For more information about key
     * policies, see the <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS
     * KMS Developer Guide</a>. If you do not specify a master key, Amazon
     * SES will not encrypt your emails. <important>Your mail is encrypted by
     * Amazon SES using the Amazon S3 encryption client before the mail is
     * submitted to Amazon S3 for storage. It is not encrypted using Amazon
     * S3 server-side encryption. This means that you must use the Amazon S3
     * encryption client to decrypt the email after retrieving it from Amazon
     * S3, as the service has no access to use your AWS KMS keys for
     * decryption. This encryption client is currently available with the <a
     * href="https://aws.amazon.com/sdk-for-java/">AWS Java SDK</a> and <a
     * href="https://aws.amazon.com/sdk-for-ruby/">AWS Ruby SDK</a> only. For
     * more information about client-side encryption using AWS KMS master
     * keys, see the <a
     * href="http://alpha-docs-aws.amazon.com/AmazonS3/latest/dev/UsingClientSideEncryption.html">Amazon
     * S3 Developer Guide</a>. </important>
     *
     * @param kmsKeyArn The customer master key that Amazon SES should use to encrypt your
     *         emails before saving them to the Amazon S3 bucket. You can use the
     *         default master key or a custom master key you created in AWS KMS as
     *         follows: <ul> <li>To use the default master key, provide an ARN in the
     *         form of
     *         <code>arn:aws:kms:REGION:ACCOUNT-ID-WITHOUT-HYPHENS:alias/aws/ses</code>.
     *         For example, if your AWS account ID is 123456789012 and you want to
     *         use the default master key in the US West (Oregon) region, the ARN of
     *         the default master key would be
     *         <code>arn:aws:kms:us-west-2:123456789012:alias/aws/ses</code>. If you
     *         use the default master key, you don't need to perform any extra steps
     *         to give Amazon SES permission to use the key.</li> <li>To use a custom
     *         master key you created in AWS KMS, provide the ARN of the master key
     *         and ensure that you add a statement to your key's policy to give
     *         Amazon SES permission to use it. For more information about giving
     *         permissions, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon
     *         SES Developer Guide</a>.</li> </ul> <p>For more information about key
     *         policies, see the <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS
     *         KMS Developer Guide</a>. If you do not specify a master key, Amazon
     *         SES will not encrypt your emails. <important>Your mail is encrypted by
     *         Amazon SES using the Amazon S3 encryption client before the mail is
     *         submitted to Amazon S3 for storage. It is not encrypted using Amazon
     *         S3 server-side encryption. This means that you must use the Amazon S3
     *         encryption client to decrypt the email after retrieving it from Amazon
     *         S3, as the service has no access to use your AWS KMS keys for
     *         decryption. This encryption client is currently available with the <a
     *         href="https://aws.amazon.com/sdk-for-java/">AWS Java SDK</a> and <a
     *         href="https://aws.amazon.com/sdk-for-ruby/">AWS Ruby SDK</a> only. For
     *         more information about client-side encryption using AWS KMS master
     *         keys, see the <a
     *         href="http://alpha-docs-aws.amazon.com/AmazonS3/latest/dev/UsingClientSideEncryption.html">Amazon
     *         S3 Developer Guide</a>. </important>
     */
    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }
    
    /**
     * The customer master key that Amazon SES should use to encrypt your
     * emails before saving them to the Amazon S3 bucket. You can use the
     * default master key or a custom master key you created in AWS KMS as
     * follows: <ul> <li>To use the default master key, provide an ARN in the
     * form of
     * <code>arn:aws:kms:REGION:ACCOUNT-ID-WITHOUT-HYPHENS:alias/aws/ses</code>.
     * For example, if your AWS account ID is 123456789012 and you want to
     * use the default master key in the US West (Oregon) region, the ARN of
     * the default master key would be
     * <code>arn:aws:kms:us-west-2:123456789012:alias/aws/ses</code>. If you
     * use the default master key, you don't need to perform any extra steps
     * to give Amazon SES permission to use the key.</li> <li>To use a custom
     * master key you created in AWS KMS, provide the ARN of the master key
     * and ensure that you add a statement to your key's policy to give
     * Amazon SES permission to use it. For more information about giving
     * permissions, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon
     * SES Developer Guide</a>.</li> </ul> <p>For more information about key
     * policies, see the <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS
     * KMS Developer Guide</a>. If you do not specify a master key, Amazon
     * SES will not encrypt your emails. <important>Your mail is encrypted by
     * Amazon SES using the Amazon S3 encryption client before the mail is
     * submitted to Amazon S3 for storage. It is not encrypted using Amazon
     * S3 server-side encryption. This means that you must use the Amazon S3
     * encryption client to decrypt the email after retrieving it from Amazon
     * S3, as the service has no access to use your AWS KMS keys for
     * decryption. This encryption client is currently available with the <a
     * href="https://aws.amazon.com/sdk-for-java/">AWS Java SDK</a> and <a
     * href="https://aws.amazon.com/sdk-for-ruby/">AWS Ruby SDK</a> only. For
     * more information about client-side encryption using AWS KMS master
     * keys, see the <a
     * href="http://alpha-docs-aws.amazon.com/AmazonS3/latest/dev/UsingClientSideEncryption.html">Amazon
     * S3 Developer Guide</a>. </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kmsKeyArn The customer master key that Amazon SES should use to encrypt your
     *         emails before saving them to the Amazon S3 bucket. You can use the
     *         default master key or a custom master key you created in AWS KMS as
     *         follows: <ul> <li>To use the default master key, provide an ARN in the
     *         form of
     *         <code>arn:aws:kms:REGION:ACCOUNT-ID-WITHOUT-HYPHENS:alias/aws/ses</code>.
     *         For example, if your AWS account ID is 123456789012 and you want to
     *         use the default master key in the US West (Oregon) region, the ARN of
     *         the default master key would be
     *         <code>arn:aws:kms:us-west-2:123456789012:alias/aws/ses</code>. If you
     *         use the default master key, you don't need to perform any extra steps
     *         to give Amazon SES permission to use the key.</li> <li>To use a custom
     *         master key you created in AWS KMS, provide the ARN of the master key
     *         and ensure that you add a statement to your key's policy to give
     *         Amazon SES permission to use it. For more information about giving
     *         permissions, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon
     *         SES Developer Guide</a>.</li> </ul> <p>For more information about key
     *         policies, see the <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS
     *         KMS Developer Guide</a>. If you do not specify a master key, Amazon
     *         SES will not encrypt your emails. <important>Your mail is encrypted by
     *         Amazon SES using the Amazon S3 encryption client before the mail is
     *         submitted to Amazon S3 for storage. It is not encrypted using Amazon
     *         S3 server-side encryption. This means that you must use the Amazon S3
     *         encryption client to decrypt the email after retrieving it from Amazon
     *         S3, as the service has no access to use your AWS KMS keys for
     *         decryption. This encryption client is currently available with the <a
     *         href="https://aws.amazon.com/sdk-for-java/">AWS Java SDK</a> and <a
     *         href="https://aws.amazon.com/sdk-for-ruby/">AWS Ruby SDK</a> only. For
     *         more information about client-side encryption using AWS KMS master
     *         keys, see the <a
     *         href="http://alpha-docs-aws.amazon.com/AmazonS3/latest/dev/UsingClientSideEncryption.html">Amazon
     *         S3 Developer Guide</a>. </important>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public S3Action withKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTopicArn() != null) sb.append("TopicArn: " + getTopicArn() + ",");
        if (getBucketName() != null) sb.append("BucketName: " + getBucketName() + ",");
        if (getObjectKeyPrefix() != null) sb.append("ObjectKeyPrefix: " + getObjectKeyPrefix() + ",");
        if (getKmsKeyArn() != null) sb.append("KmsKeyArn: " + getKmsKeyArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode()); 
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode()); 
        hashCode = prime * hashCode + ((getObjectKeyPrefix() == null) ? 0 : getObjectKeyPrefix().hashCode()); 
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof S3Action == false) return false;
        S3Action other = (S3Action)obj;
        
        if (other.getTopicArn() == null ^ this.getTopicArn() == null) return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false) return false; 
        if (other.getBucketName() == null ^ this.getBucketName() == null) return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false) return false; 
        if (other.getObjectKeyPrefix() == null ^ this.getObjectKeyPrefix() == null) return false;
        if (other.getObjectKeyPrefix() != null && other.getObjectKeyPrefix().equals(this.getObjectKeyPrefix()) == false) return false; 
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null) return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false) return false; 
        return true;
    }
    
}
    