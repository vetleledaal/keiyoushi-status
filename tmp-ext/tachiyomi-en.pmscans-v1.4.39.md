# Extension Validation Report

- Extension: tachiyomi-en.pmscans-v1.4.39
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 263040414613624318
- Source name: Rackus
- Source language: en
- Selected manga input: latest offset 0: Ryuna (`.../ryuna`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 29 | Winning Shot! (`.../winning-shot`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 29 | Ryuna (`.../ryuna`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Ryuna (`.../ryuna`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Ryuna (`.../ryuna`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 20 | Chapter 0 (`.../ryuna-chapter-0`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 13 |  |  | <1s |

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
| popular listing | PASS | 29 entries |  |  |  |
| latest listing | PASS | 29 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ryuna, URL=`.../ryuna` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 59/59 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 59/59 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rackusreads.com/.../RYUNA-2-219x300.gif` (image/gif (format: 89a), 38515 bytes, 219x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ryuna` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://rackusreads.com/.../RYUNA-2.gif` (image/gif (format: 89a), 9395837 bytes, 500x684) |  |  |  |
| details author | PASS | Park Si-In |  |  |  |
| details artist | PASS | Lee Jun |  |  |  |
| details genres | PASS | Drama, Fantasy, Josei, Supernatural, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A mysterious race \[Ryuna\] that is reborn as immortal beings that drink blood from humans They have established a community of their own and They have scattered all over the world like fortune tellers, Coexisting with humans while hiding their identities. Currently, in Seoul, South Korea, One of the Ryunas living in the city, ‘Shin Ryu-ho’ She used to be a human woman named ‘Seo Yi-hyun’ She thought she had no more expectations for her current life, But at that moment, she is reborn as Ryu-na. However, the new star of the entertainment industry, ‘Hwi-na’, is still searching for her former human, ‘Seo Yi-hyun’… Is there any meaning in a world where precious people become unhappy? Can I live an immortal life as if nothing happened in such a world? A desperate drama that holds the fate of one’s own life and that of someone precious in one’s hands begins now.<br><br>Alternative Names: 류나 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 20 chapters |  |  |  |
| chapter dates | PASS | 20 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://rackusreads.com/.../00-RYU-creds.webp` (image/webp (encoding: lossy), 142436 bytes, 1200x1197) |  |  |  |
