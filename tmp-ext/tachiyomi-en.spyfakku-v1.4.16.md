# Extension Validation Report

- Extension: tachiyomi-en.spyfakku-v1.4.16
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
- Source implementation: keiyoushi.source.Generated
- Source ID: 6202325652827735606
- Source name: SpyFakku
- Source language: en
- Selected manga input: latest offset 0: Only Fools Rely on Cat-Eared Slaves - My First Domestication Finale (`.../18827 <redacted query values: 27 and hash>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Hidden Emotions (`.../18792 <redacted query values: 22 and hash>`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Isekai Mononoke Hot Spring Town 6 (`.../18725 <redacted query values: 21 and hash>`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Only Fools Rely on Cat-Eared Slaves - My First Domestication Finale (`.../18827 <redacted query values: 27 and hash>`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Last Summer - Color Version (`.../18803 <redacted query values: 22 and hash>`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Only Fools Rely on Cat-Eared Slaves - My First Domestication Finale (`.../18827 <redacted query values: 27 and hash>`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Only Fools Rely on Cat-Eared Slaves - My First Domestication Finale (`.../18827 <redacted query values: 27 and hash>`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../18827 <redacted query values: 27 and hash>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 27 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Only Fools Rely on Cat-Eared Slaves - My First Domestication Finale, URL=`.../18827 <redacted query values: 27 and hash>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `<redacted URL #1: resource; absolute; valid web scheme; workstation or local network; query parameters: type>` (image/webp (encoding: lossy), 65628 bytes, 800x1138) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../18827 <redacted query values: 27 and hash>` |  |  |  |
| details thumbnail URL | PASS | `<redacted URL #1: resource; absolute; valid web scheme; workstation or local network; query parameters: type>` |  |  |  |
| details author | PASS | Kyougoku Touya |  |  |  |
| details artist | PASS | Kyougoku Touya |  |  |  |
| details genres | PASS | Catgirl, Hentai, Kemonomimi, Light Hair, Nakadashi, Sci-Fi, Squirting, Story Arc, Uncensored, Unlimited, Vanilla, X-ray |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Publishers: FAKKU<br>Magazines: Dascomi Vol.42<br>Parodies: Original Work<br>Pages: 27<br><br>Size: 38.00 MB |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `<redacted URL #2: resource; absolute; valid web scheme; workstation or local network>` (image/png, 2664427 bytes, 1337x1920) |  |  |  |
