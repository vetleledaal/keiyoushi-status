# Extension Validation Report

- Extension: tachiyomi-all.nhentaiwebsite-v1.6.12
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 1
- Warnings: 2
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source theme: galleryadults
- Source ID: 4655985745385044320
- Source name: NHentai.website
- Source language: en
- Selected manga input: popular offset 0: [multiplication (3x3)] Piper-san Okinasugi!! | Piper, you're sleeping way too much!! (Zenless Zone Zero) [English] [MTL] [Digital] (`.../684267`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | [multiplication (3x3)] Piper-san Okinasugi!! | Piper, you're sleeping way too much!! (Zenless Zone Zero) [English] [MTL] [Digital] (`.../684267`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | [Aoi Hoshi ni Umareta Dark Angel (Sabajiba Gonhachirou)] Youkoso! Muchimuchi Dosukebe na Elf no Sato e!! 2 Uchiki na Muttsuri L Cup Sister Hen | Welcome to the Voluptuous & Perverted Elf Village!! 2 ~Shy&Reserved L-Cup Nun Edition~ [English] [MayoTL] (`.../684174`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | [multiplication (3x3)] Piper-san Okinasugi!! | Piper, you're sleeping way too much!! (Zenless Zone Zero) [English] [MTL] [Digital] (`.../684267`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [multiplication (3x3)] Piper-san Okinasugi!! | Piper, you're sleeping way too much!! (Zenless Zone Zero) [English] [MTL] [Digital] (`.../684267`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../684267`) |  | <1s |
| pages | `getPageList(chapter)` | success | 24 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=\[multiplication (3x3)\] Piper-san Okinasugi!! \| Piper, you're sleeping way too much!! (Zenless Zone Zero) \[English\] \[MTL\] \[Digital\], URL=`.../684267` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://t1.nhentai.jp.net/.../thumb.webp` -> 2 manga URLs (examples: `.../684267`, `.../684267`) |  |  |  |
| thumbnail | PASS | `https://t1.nhentai.jp.net/.../thumb.webp` (image/webp (encoding: lossy), 39814 bytes, 500x706) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../684267` |  |  |  |
| details thumbnail URL | FAIL | Differs from selected listing thumbnail; Thumbnail URL `https://t1.nhentai.jp.net/.../cover.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 522 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details author | PASS | 3x3 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | midget, rough translation |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Parodies**: zenless zone zero<br><br>**Characters**: piper wheel<br><br>**Groups**: multiplication<br><br>**Languages**: english, translated<br><br>**Categories**: doujinshi<br><br>**Pages**: 24<br><br>**Alternative title**: \[multiplication (3×3)\] パイパーさん起きなすぎ！！ (ゼンレスゾーンゼロ) \[英訳\] \[DL版\] |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://nhentai.website/.../english <redacted query values: page>` to `https://nhentai.website/.../english <redacted query values: page>` (1 redirects); popular: `https://nhentai.website/.../english <redacted query values: page>` to `https://nhentai.website/.../english <redacted query values: page>` (1 redirects); popular: `https://nhentai.website/.../684267` to `https://nhentai.website/.../684267` (1 redirects); popular: `https://nhentai.website/.../684267` to `https://nhentai.website/.../684267` (1 redirects) |  |  |  |
| page load | PASS | `https://t1.nhentai.jp.net/.../1.webp` (image/webp (encoding: lossy), 267608 bytes, 1280x1807) |  |  |  |
