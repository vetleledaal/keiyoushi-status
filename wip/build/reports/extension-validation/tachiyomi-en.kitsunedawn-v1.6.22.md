# Extension Validation Report

- Extension: tachiyomi-en.kitsunedawn-v1.6.22
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: keyoapp
- Source ID: 7739452864322240494
- Source name: Kitsune Dawn
- Source language: en
- Selected manga input: popular offset 0: The King's Omega: The Coldhearted Alpha Dotes on His One True Fate (`.../887ca2ac-3038-49de-85e0-c2e11328c6b7`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | The King's Omega: The Coldhearted Alpha Dotes on His One True Fate (`.../887ca2ac-3038-49de-85e0-c2e11328c6b7`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Made to Come Sweetly and Lewdly by the Finest Obsessive Love...! Anthology Comic (`.../935b8130-e91d-4da4-a3d4-813e8ba63ca0`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Kotake Jin's Obsessive Love (`.../1a3f9ead-6853-4ad0-8c36-dcdbe8d80851`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Made to Come Sweetly and Lewdly by the Finest Obsessive Love...! Anthology Comic (`.../935b8130-e91d-4da4-a3d4-813e8ba63ca0`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The King's Omega: The Coldhearted Alpha Dotes on His One True Fate (`.../887ca2ac-3038-49de-85e0-c2e11328c6b7`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The King's Omega: The Coldhearted Alpha Dotes on His One True Fate (`.../887ca2ac-3038-49de-85e0-c2e11328c6b7`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 18 | Chapter 01 (`.../80f0f411-9ebe-425e-8760-63bf1af7043b`) |  | <1s |
| pages | `getPageList(chapter)` | success | 38 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The King's Omega: The Coldhearted Alpha Dotes on His One True Fate, URL=`.../887ca2ac-3038-49de-85e0-c2e11328c6b7` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 89/89 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 89/89 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.kitsunedawn.com/.../300x450.webp` (image/webp (encoding: lossy), 37114 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../887ca2ac-3038-49de-85e0-c2e11328c6b7` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.kitsunedawn.com/.../600x900.webp` (image/webp (encoding: lossy), 105942 bytes, 600x900) |  |  |  |
| details author | PASS | Shio Oninko (塩おにんこ), Hananomiya Koko (華野宮子) |  |  |  |
| details artist | PASS | Shio Oninko (塩おにんこ), Hananomiya Koko (華野宮子) |  |  |  |
| details genres | PASS | Japanese, TL Manga, Isekai, Reincarnation, Omegaverse, Fantasy, Royalty |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Riko is an ordinary office worker living an unremarkable life—until the day she suddenly finds herself lost in a world she has never seen before. There, she encounters a prince as beautiful and manly as a figure from a painting. Merely being near him sets her body aflame with an intense heat and ache unlike anything she has ever experienced. Though she knows it is shameful, Riko finds herself unable to resist seeking him out. Her body is consumed by a powerful estrus she cannot control, and she learns that the only way to suppress it is to have an alpha's essence poured deep inside her. As she is drawn further into this unfamiliar world, Riko must confront the meaning of being the King's Omega. What is this bond that binds her to the coldhearted prince, and why does fate seem to have chosen her alone? A tale of instinct and destiny unfolds in this authentic otherworldly omegaverse TL, where a ruthless alpha dotes on his one and only fated mate.<br><br>Alternative Titles:<br>- 王のΩ～冷酷αはたったひとりの運命を寵愛する～<br>- Ō no Omega ~Reikoku Alpha wa Tatta Hitori no Unmei o Chōai suru~ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 18 chapters |  |  |  |
| chapter dates | LINT | All 18 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=18 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.kitsunedawn.com/.../001.jpg` (image/jpeg, 880632 bytes, 1254x1254) |  |  |  |
