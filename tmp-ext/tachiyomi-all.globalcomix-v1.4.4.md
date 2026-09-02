# Extension Validation Report

- Extension: tachiyomi-all.globalcomix-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.c
- Source ID: 1702911211040495914
- Source name: GlobalComix
- Source language: en
- Selected manga input: latest offset 0: Life Remains (`.../17918`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 22 | Absolute Batman (2024-) (`.../26982`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | The Horror of Godzilla [Kai-Sei Era] (`.../47969`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Life Remains (`.../17918`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Frankenstein (`.../17336`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 22 | Life Remains (`.../17918`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Life Remains (`.../17918`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 65 | Ch.103 - Break on Through (to the other side) (`.../076228f8-4cf7-4bbb-909c-88fe812c4db9`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | 1-10s |

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
| popular listing | PASS | 22 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Life Remains, URL=`17918` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 116/116 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 116/116 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://globalcomix.com/.../59084_9160774730ced5741d88c65a9d10f6e6_large.webp` (image/webp (container: extended), 74514 bytes, 540x834) |  |  |  |
| details identity | PASS | Details preserved selected URL `17918` |  |  |  |
| details thumbnail URL | PASS | `https://globalcomix.com/.../59084_9160774730ced5741d88c65a9d10f6e6_large.webp` |  |  |  |
| details author | PASS | Daco |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Biographies |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | An autobiography of the author, a psychological thriller spanning two centuries, five continents and many peculiar adventures |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 8 name |  |  |  |
| chapters | PASS | 65 chapters |  |  |  |
| chapter dates | PASS | 65 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://globalcomix-comics-assets-files-thumbnails.nyc3.cdn.digitaloceanspaces.com/.../12750376_e142d5f3cb4ccfd20c36cea04cac6360.png` (image/jpeg, 13511 bytes, 280x106) |  |  |  |
