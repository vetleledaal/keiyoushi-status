# Extension Validation Report

- Extension: tachiyomi-en.nuviatoon-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9071935154458913856
- Source name: Nuvia Toon
- Source language: en
- Selected manga input: popular offset 0: Heart-Aching (`.../heart-aching`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Heart-Aching (`.../heart-aching`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | Don't Be Too Nice (`.../don-t-be-too-nice`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | My Bias Gets on the Last Train (`.../my-bias-gets-on-the-last-train`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | The Prize of Youth (`.../the-prize-of-youth`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Heart-Aching (`.../heart-aching`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Heart-Aching (`.../heart-aching`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 35 | Chapter 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 161 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Heart-Aching, URL=`heart-aching` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.nuviatoon.org/.../cbb97dfa-40c1-421f-8092-644d2584ccb1.webp` (image/webp (encoding: lossy), 99294 bytes, 600x900) |  |  |  |
| details identity | PASS | Details preserved selected URL `heart-aching` |  |  |  |
| details thumbnail URL | PASS | `https://media.nuviatoon.org/.../cbb97dfa-40c1-421f-8092-644d2584ccb1.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Romance, Shoujo |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Rating: 5/5 (38 ratings)<br><br>My first love, Joo Arin, whom I met again after five years. Why has she changed so much?<br><br>Associated Name(s):<br>- Aching<br>- Aridorok<br>- 아리도록 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 35 chapters |  |  |  |
| chapter dates | PASS | 35 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 161 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://nuviatoon.a57a9ab619b3f91ead3c71426d0451c6.r2.cloudflarestorage.com/.../0001.webp <redacted query values: X-Amz-Algorithm, X-Amz-Content-Sha256, X-Amz-Credential, X-Amz-Date, X-Amz-Expires, X-Amz-Signature, X-Amz-SignedHeaders, x-amz-checksum-mode, and x-id>` (image/webp (encoding: lossy), 347978 bytes, 1254x1254) |  |  |  |
