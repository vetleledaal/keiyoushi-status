# Extension Validation Report

- Extension: tachiyomi-ru.hentailib-v1.4.62
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 30
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6425650164840473547
- Source name: HentaiLib
- Source language: ru
- Selected manga input: latest offset 0: Draw Yours (`.../23779--cartoonists-nsfw`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 60 | Adabana (`.../33052--adabana`) |  | 10s+ |
| popular_next | `fetchPopularManga(2)` | success | 60 | i will dedicate myself to you, captain (`.../207225--enen-no-shouboutai-dj-tsutomemasu-yo-dai-taicho`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 15 | Draw Yours (`.../23779--cartoonists-nsfw`) |  | 10s+ |
| latest_next | `fetchLatestUpdates(2)` | success | 15 | The secret of a public bath (`.../168307--yactoadam`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Draw Yours (`.../23779--cartoonists-nsfw`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Draw Yours (`.../23779--cartoonists-nsfw`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 73 | Том 1. Глава 1 (`.../chapter <redacted query values: , volume, and number>`) |  | <1s |
| pages | `fetchPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Draw Yours, URL=`.../23779--cartoonists-nsfw` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 152/152 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 152/152 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cover.cdnlibs.org/.../cover_250x350.jpg` (image/jpeg, 40045 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../23779--cartoonists-nsfw` |  |  |  |
| details thumbnail URL | PASS | `https://cover.cdnlibs.org/.../cover_250x350.jpg` |  |  |  |
| details author | PASS | KimMundo |  |  |  |
| details artist | PASS | KimMundo |  |  |  |
| details genres | PASS | Манхва, 18+ (RX), Гарем, Драма, Комедия, Романтика, Эротика, Этти, Кримпай, С Сюжетом |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Художник 18+<br>★★★★☆ 8.39 (голосов: 538)<br>Альтернативные названия:<br>Cartoonists NSFW (Korean) / Draw Yours / Geugeon Niga Geuliseyo / 그건 니가 그리세요<br><br>История о двух авторах вебтунов, которые поселились в странном доме. <br>Давать волю грязным фантазиям в одиночку не так-то просто…<br>«Эй, не хочешь стать героем моего пикантного комикса?»<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 73 chapters |  |  |  |
| chapter dates | PASS | 73 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 404 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
