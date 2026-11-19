# Extension Validation Report

- Extension: tachiyomi-all.kodokustudio-v1.6.57
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 2
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4730948540511990292
- Source name: Kodoku Studio
- Source language: all
- Selected manga input: latest offset 0: Reverend Insanity [EN] (`.../en`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 5 | Reverend Insanity [EN] (`.../en`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 5 | Reverend Insanity [EN] (`.../en`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Reverend Insanity [EN] (`.../en`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Reverend Insanity [EN] (`.../en`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 33 | Chapter 1 (`.../en`) |  | <1s |
| pages | `getPageList(chapter)` | success | 68 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 5 entries |  |  |  |
| latest listing | PASS | 5 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Reverend Insanity \[EN\], URL=`reverend-insanity/en` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 11/11 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 11/11 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://kodokustudio.com/.../11509a84e19143c99e4696be50ee9a40.webp <redacted query values: X-Amz-Expires, X-Amz-Algorithm, X-Amz-Credential, X-Amz-Date, X-Amz-SignedHeaders, and X-Amz-Signature>` -> all 5 manga URLs (examples: `reverend-insanity/en`, `reverend-insanity/ar`, `reverend-insanity/tr`) |  |  |  |
| thumbnail | PASS | `https://kodokustudio.com/.../11509a84e19143c99e4696be50ee9a40.webp <redacted query values: X-Amz-Expires, X-Amz-Algorithm, X-Amz-Credential, X-Amz-Date, X-Amz-SignedHeaders, and X-Amz-Signature>` (image/webp (container: extended), 118868 bytes, 1600x2000) |  |  |  |
| details identity | PASS | Details preserved selected URL `reverend-insanity/en` |  |  |  |
| details thumbnail URL | PASS | `https://kodokustudio.com/.../11509a84e19143c99e4696be50ee9a40.webp <redacted query values: X-Amz-Expires, X-Amz-Algorithm, X-Amz-Credential, X-Amz-Date, X-Amz-SignedHeaders, and X-Amz-Signature>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 33 chapters |  |  |  |
| chapter dates | PASS | 33 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 68 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://kodokueasyaccess.com/.../series` to `https://kodokustudio.com/.../series` (1 redirects); popular: `https://kodokueasyaccess.com/.../chapters` to `https://kodokustudio.com/.../chapters` (1 redirects); popular: `https://kodokueasyaccess.com/.../series` to `https://kodokustudio.com/.../series` (1 redirects); popular: `https://kodokueasyaccess.com/.../chapters` to `https://kodokustudio.com/.../chapters` (1 redirects); popular: `https://kodokueasyaccess.com/.../reverend-insanity` to `https://kodokustudio.com/.../reverend-insanity` (1 redirects); popular: `https://kodokueasyaccess.com/.../series` to `https://kodokustudio.com/.../series` (1 redirects); popular: `https://kodokueasyaccess.com/.../chapters` to `https://kodokustudio.com/.../chapters` (1 redirects); popular: `https://kodokueasyaccess.com/.../chapters` to `https://kodokustudio.com/.../chapters` (1 redirects); popular: `https://kodokueasyaccess.com/.../en` to `https://kodokustudio.com/.../en` (1 redirects) |  |  |  |
| page load | PASS | `https://kodokustudio.com/.../0000-0000.webp <redacted query values: X-Amz-Expires, X-Amz-Algorithm, X-Amz-Credential, X-Amz-Date, X-Amz-SignedHeaders, and X-Amz-Signature>` (image/webp (encoding: lossy), 689116 bytes, 1600x3775) |  |  |  |
