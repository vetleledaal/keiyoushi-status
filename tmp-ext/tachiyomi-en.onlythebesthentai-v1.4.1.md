# Extension Validation Report

- Extension: tachiyomi-en.onlythebesthentai-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5862792365006156918
- Source name: Only The Best Hentai
- Source language: en
- Selected manga input: popular offset 0: The Reverse Bunny Girl’s Revenge (`.../the-reverse-bunny-girls-revenge`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | The Reverse Bunny Girl’s Revenge (`.../the-reverse-bunny-girls-revenge`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Secret Apartment Circular (`.../secret-apartment-circular`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | The Reverse Bunny Girl’s Revenge (`.../the-reverse-bunny-girls-revenge`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Secret Apartment Circular (`.../secret-apartment-circular`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 20 | The Reverse Bunny Girl’s Revenge (`.../the-reverse-bunny-girls-revenge`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Reverse Bunny Girl’s Revenge (`.../the-reverse-bunny-girls-revenge`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter [24 pages] (`.../the-reverse-bunny-girls-revenge`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 24 |  |  | 1-10s |

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
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Reverse Bunny Girl’s Revenge, URL=`.../the-reverse-bunny-girls-revenge` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://onlythebesthentai.com/.../1-14-768x1092.webp` (image/webp (encoding: lossy), 134640 bytes, 768x1092) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-reverse-bunny-girls-revenge` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://onlythebesthentai.com/.../1-14.webp` (image/webp (encoding: lossy), 244816 bytes, 1280x1820) |  |  |  |
| details author | PASS | Kurakino Issiki |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | big tits, bunny girl, creampie, facial, groping, pussy licking, titfuck |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Parody: Fate<br>Characters: Gudao, Scathach<br>Pages: 24<br><br>The Reverse Bunny Girl’s Revenge \[Gyaku Bunny-san no Gyakushuu\], Just another bunny girl slut that empty your balls dry. Very cool though |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://onlythebesthentai.com/.../1-14.webp` (image/webp (encoding: lossy), 244816 bytes, 1280x1820) |  |  |  |
