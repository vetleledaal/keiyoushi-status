# Extension Validation Report

- Extension: tachiyomi-en.artlapsa-v1.6.33
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: keyoapp
- Source ID: 734404203508686053
- Source name: Art Lapsa
- Source language: en
- Selected manga input: popular offset 0: The Count’s Daughter Whose Fiancé Was Stolen Decides to Live Life on Her Own Terms (`.../c07f4744-13fa-483e-9eb5-f6e45af0c5a6`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | The Count’s Daughter Whose Fiancé Was Stolen Decides to Live Life on Her Own Terms (`.../c07f4744-13fa-483e-9eb5-f6e45af0c5a6`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Since I Was Born as a Noble Young Lady, I Want to Live the Carefree NEET Life I've Always Dreamed Of (`.../24953cad-ae10-42b2-b5ea-33ce4faddbea`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | A Blind Little Girl's Survival in a Magical World (`.../75063950-b5e3-408b-9640-41eb1c383ac7`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Starting Today, We're a Contract Family (`.../74ce51f6-e81d-4132-8a17-3f5a3243db0c`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Count’s Daughter Whose Fiancé Was Stolen Decides to Live Life on Her Own Terms (`.../c07f4744-13fa-483e-9eb5-f6e45af0c5a6`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Count’s Daughter Whose Fiancé Was Stolen Decides to Live Life on Her Own Terms (`.../c07f4744-13fa-483e-9eb5-f6e45af0c5a6`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | Chapter 01 (`.../17258bdd-bb6f-4116-9235-950f7de05619`) |  | <1s |
| pages | `getPageList(chapter)` | success | 39 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Count’s Daughter Whose Fiancé Was Stolen Decides to Live Life on Her Own Terms, URL=`.../c07f4744-13fa-483e-9eb5-f6e45af0c5a6` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 89/89 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 89/89 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.artlapsa.com/.../300x450.webp` (image/webp (encoding: lossy), 38206 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../c07f4744-13fa-483e-9eb5-f6e45af0c5a6` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.artlapsa.com/.../600x900.webp` (image/webp (encoding: lossy), 108824 bytes, 600x900) |  |  |  |
| details author | PASS | Kayanagi Ichiwa (かやなぎ一羽), Yano Rito (矢野りと) |  |  |  |
| details artist | PASS | Kayanagi Ichiwa (かやなぎ一羽), Yano Rito (矢野りと) |  |  |  |
| details genres | PASS | Japanese, Fantasy, Romance, Isekai, Comeuppance, Broken Engagement, TL Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Mary, a count's daughter, has always tried to meet everyone's expectations by being obedient and putting others first. However, when her older sister's engagement ends, Mary's own fiancé begins acting as her sister's devoted protector. As Mary watches their closeness grow, she becomes the subject of cruel gossip and feels increasingly neglected by both her fiancé and her family. Exhausted by years of suppressing her feelings, she eventually reaches a breaking point. When a young man notices her distress and asks whether she is forcing herself to endure too much, Mary begins to reconsider the life she has been living. Rather than continuing to sacrifice her happiness for her family, she decides to let go of the people who have hurt her and start living for herself.<br><br>Alternative Titles:<br>- 婚約者を奪われた伯爵令嬢、そろそろ好きに生きてみようと思います<br>- Konyakusha o Ubawareta Hakushaku Reijou, Sorosoro Suki ni Ikite Miyou to Omoimasu |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 39 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.artlapsa.com/.../001.jpg` (image/jpeg, 901095 bytes, 1125x1941) |  |  |  |
