# Extension Validation Report

- Extension: tachiyomi-en.suryascans-v1.6.55
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: keyoapp
- Source ID: 1061713767402958340
- Source name: Genz Toons
- Source language: en
- Selected manga input: popular offset 0: The Regressor and the Blind Saint  (`.../the-regressor-and-the-blind-saint`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 246 | The Regressor and the Blind Saint  (`.../the-regressor-and-the-blind-saint`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 213 | I Became the Youngest Martial God-Class Disciple (`.../i-became-the-youngest-martial-god`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Regressor and the Blind Saint  (`.../the-regressor-and-the-blind-saint`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Regressor and the Blind Saint (`.../the-regressor-and-the-blind-saint`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 19 | Chapter 0 (`.../65d42f5016a-65d47320259`) |  | <1s |
| pages | `getPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| popular listing | PASS | 246 entries |  |  |  |
| latest listing | PASS | 213 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Regressor and the Blind Saint , URL=`.../the-regressor-and-the-blind-saint` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 460/460 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 460/460 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wsrv.nl <redacted query values: url and w>` (image/jpeg, 96915 bytes, 480x640) |  |  |  |
| details identity | UNUSUAL | Details changed selected title The Regressor and the Blind Saint  to The Regressor and the Blind Saint |  |  |  |
| details thumbnail URL | PASS | `https://wsrv.nl <redacted query values: url and w>` |  |  |  |
| details author | PASS | papapa, Vadada |  |  |  |
| details artist | PASS | Woo Gi |  |  |  |
| details genres | PASS | Manhwa, Action, Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Vera, born a beggar, trampled over others and did not hesitate to make vile deals in order to survive. Even in the era when the Demon King appeared, she did not fight like a hero. She hid herself away in the deepest darkness and preserved only her own life. She survived to the very end that way, but what returned to her after the war was karmic retribution. In the moment she waited for death, consumed by the curse, Vera thought that at the end of her life there would be no one to remain by her side—and she did not wish for anyone either. But when she opened her eyes, she was in a gutter, and there was Renee—the blind Holy Maiden declared dead. Renee had the wretched appearance of a blind woman covered in burn scars, yet with a heart kinder and more selfless than anyone's, she took Vera in. But in the end, she died, and Vera could not prevent that death. After the regression, she resolves that this time, at the very least, she will go to Renee first and protect her no matter what. But protecting Renee is not something that can be solved by simply growing stronger. On the day the Holy Maiden's stigmata descends, the Holy Nation, the Empire, the Kingdom Alliance, the Dragonian, and even the Followers of the Night—the entire continent begins to move around her.<br><br>Alternative Titles:<br>- 회귀자와 맹인 성녀 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 19 chapters |  |  |  |
| chapter dates | PASS | 19 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.meowing.org/.../65d47320259.avif` (image/avif (format: avif), 327484 bytes, 900x14000) |  |  |  |
