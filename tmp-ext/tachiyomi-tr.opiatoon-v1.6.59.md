# Extension Validation Report

- Extension: tachiyomi-tr.opiatoon-v1.6.59
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 22
- Lint: 1
- Warnings: 0
- Skipped: 11
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2266890064732906146
- Source name: Opiatoon
- Source language: tr
- Selected manga input: popular offset 0: Painter of the Night (`.../1245`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Painter of the Night (`.../1245`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Sadistic Beauty BL Sidestory (`.../16651`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Ennead (`.../12480`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Nagahama to Be, or Not to Be (`.../30650`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Painter of the Night (`.../1245`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | error | 0 |  | java.io.IOException: Okumak için WebView üzerinden giriş yapın | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 143 | Bölüm 1 (`.../bolum-1`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.io.IOException: Okumak için WebView üzerinden giriş yapın | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | java.io.IOException: Okumak için WebView üzerinden giriş yapın | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.io.IOException: Okumak için WebView üzerinden giriş yapın | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Painter of the Night, URL=`1245` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://opiatoon.shop/.../paineterxxxxx-465x630.jpg` (image/jpeg, 51239 bytes, 465x630) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 143 chapters |  |  |  |
| chapter dates | LINT | 138 of 143 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=138 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Okumak için WebView üzerinden giriş yapın |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
