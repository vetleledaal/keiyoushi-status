# Extension Validation Report

- Extension: tachiyomi-en.sanascans-v1.6.29
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
- Source theme: iken
- Source ID: 1931508394363321246
- Source name: Sana Scans
- Source language: en
- Selected manga input: popular offset 0: The Oblivious Saint Who Leaks Power Finds Happiness in Her New Home (`.../the-oblivious-saint-who-leaks-power-finds-happiness-in-her-new-home`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | The Oblivious Saint Who Leaks Power Finds Happiness in Her New Home (`.../the-oblivious-saint-who-leaks-power-finds-happiness-in-her-new-home`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | The Disappeared Villainess (`.../the-disappeared-villainess`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | A Stunning New Life After Being a Villainess?! (`.../a-stunning-new-life-after-being-a-villainess`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | At Five Years Old, I Became the Dragon Prince’s Bride. (`.../at-five-years-old-i-became-the-dragon-prince's-bride.`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Oblivious Saint Who Leaks Power Finds Happiness in Her New Home (`.../the-oblivious-saint-who-leaks-power-finds-happiness-in-her-new-home`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Oblivious Saint Who Leaks Power Finds Happiness in Her New Home (`.../the-oblivious-saint-who-leaks-power-finds-happiness-in-her-new-home`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 39 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 52 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Oblivious Saint Who Leaks Power Finds Happiness in Her New Home, URL=`the-oblivious-saint-who-leaks-power-finds-happiness-in-her-new-home#178` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.sanascans.com/.../d8a3ae6b-7af3-475b-abf9-013866b0842d.webp` (image/webp (encoding: lossy), 293106 bytes, 704x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `the-oblivious-saint-who-leaks-power-finds-happiness-in-her-new-home#178` |  |  |  |
| details thumbnail URL | PASS | `https://media.sanascans.com/.../d8a3ae6b-7af3-475b-abf9-013866b0842d.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manga, Shoujo, Fantasy, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Lady Carolina Sanchez has spent her entire life believing she is the “Sanchez family disgrace,” a notion constantly reinforced by her elder sister, Flora. In public, Flora is a model of kindness and gentility, always coming to her baby sister’s defense...but behind closed doors, she heaps abuse on Carolina, leveraging Carolina’s perceived shortcomings to suit her own ends. When Carolina is sent to the neighboring Malcosian Empire for a political marriage to Prince Edward Ruby Martinez, she expects to disappoint her new family too. But, to her surprise, her husband-to-be and her new in-laws seem to genuinely adore her! Can Carolina escape the anguish of her past and rise to the occasion as Edward’s imperial consort? She just might, especially if she’s not quite as powerless as she assumed... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 39 chapters |  |  |  |
| chapter dates | PASS | 39 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://media.sanascans.com/.../001.webp` (image/webp (encoding: lossy), 1570774 bytes, 2560x3640) |  |  |  |
