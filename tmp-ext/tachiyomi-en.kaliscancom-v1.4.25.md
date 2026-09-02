# Extension Validation Report

- Extension: tachiyomi-en.kaliscancom-v1.4.25
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7660637864742395387
- Source name: KaliScan
- Source language: en
- Selected manga input: popular offset 0: Painter of the Night (`.../364-painter-of-the-night`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 48 | Painter of the Night (`.../364-painter-of-the-night`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 48 | Stranger Than Friends (`.../18490-stranger-than-friends`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 48 | A Fallen Star (`.../103136-a-fallen-star`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 48 | Super God Gene (`.../34883-super-god-gene`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Painter of the Night (`.../364-painter-of-the-night`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Painter of the Night (`.../364-painter-of-the-night`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 146 | Chapter 0 (`.../chapter-0`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 8 |  |  | 1-10s |

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
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Painter of the Night, URL=`.../364-painter-of-the-night` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 193/193 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 193/193 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.1stmangago.com/.../6cffb03a6cf78288d4bd5a7f457e3718.webp` (image/webp (encoding: lossy), 130534 bytes, 1500x2000) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../364-painter-of-the-night` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.1stmangago.com/.../6cffb03a6cf78288d4bd5a7f457e3718.webp` |  |  |  |
| details author | PASS | Byeonduck |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Historical, Manhwa, Mature, Psychological, Romance, Smut, Yaoi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS |  Na-kyum is a young painter with an exceptional talent: creating erotic images of men. Though he has published a few collections under a pseudonym, he has decided to quit painting. Then Seungho, a young nobleman, barges into his life. A hell-raiser notorious for his insatiable lust, Seungho forces Na-kyum to become his private painter. However, the nights that await Na-kyum are beyond anything he could have imagined… <br><br>Alt name(s): 야화첩, POTN |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 146 chapters |  |  |  |
| chapter dates | LINT | 1 of 146 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | UNUSUAL | Duplicate page URLs: `https://s3.1stmggv7.xyz/.../wtm1.webp <redacted query values: acc and expires>` at pages 1, 8 |  |  |  |
| page load | PASS | `https://s3.1stmggv7.xyz/.../wtm1.webp <redacted query values: acc and expires>` (image/webp (container: extended), 87536 bytes, 940x338) |  |  |  |
