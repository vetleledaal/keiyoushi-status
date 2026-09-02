# Extension Validation Report

- Extension: tachiyomi-en.evascans-v1.4.35
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1911019612901009263
- Source name: Eva Scans
- Source language: en
- Selected manga input: latest offset 0: The Maid With a Child (`.../the-maid-with-a-child`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 40 | You Like Someone With That Face? (`.../you-like-someone-with-that-face`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 40 | I Don’t Believe in Dating Apps! (`.../i-dont-believe-in-dating-apps`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 40 | The Maid With a Child (`.../the-maid-with-a-child`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 40 | Aisanai to Iwaremashite mo – Moto Maou no Hakushaku Reijou wa Kimajime Gunjin ni Ezuke wo Sarete Shiawase ni naru (`.../aisanai-to-iwaremashite-mo-moto-maou-no-hakushaku-reijou-wa-kimajime-gunjin-ni-ezuke-wo-sarete-shiawase-ni-naru`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Maid With a Child (`.../the-maid-with-a-child`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Maid With a Child (`.../the-maid-with-a-child`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 26 | Chapter 1 (`.../the-maid-with-a-child-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 22 |  |  | 1-10s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Maid With a Child, URL=`.../the-maid-with-a-child` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../61FF558C-BBBF-4993-B0B3-5D136935D537.png` (image/png, 2304519 bytes, 1047x1501) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-maid-with-a-child` |  |  |  |
| details thumbnail URL | PASS | `https://i2.wp.com/.../61FF558C-BBBF-4993-B0B3-5D136935D537.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Drama, Fantasy, Manhwa, Romance, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Rating: 9.00/10<br><br>Views: 1,967<br><br>Synopsis: Adelen, the son of a maid, dreams of a simple life: marrying a kind and handsome man and raising a loving child. But when her master returns from war, he unexpectedly entrusts her with the infant crown prince of an... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 26 chapters |  |  |  |
| chapter dates | PASS | 26 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://evascans.org/.../01-38.jpg` (image/jpeg, 1059305 bytes, 800x7160) |  |  |  |
