# Extension Validation Report

- Extension: tachiyomi-ru.hentailib-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: libgroup
- Source ID: 6425650164840473547
- Source name: HentaiLib
- Source language: ru
- Selected manga input: latest offset 0: Death Note (`.../272743--death-note`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 60 | Adabana (`.../33052--adabana`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 60 | Room where you have to eat hearts to get out (`.../210420--heart-wo-tabenai-to-derarenai-heya`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 15 | Death Note (`.../272743--death-note`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 15 | S24 File (`.../275971--s24-file-001-a-alpha`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | Death Note (`.../79--desu-noto`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Death Note (`.../272743--death-note`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 14 | Том 1. Глава 1 - Скука (`.../chapter <redacted query values: , volume, and number>`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 23: title=Death Note, URL=`.../272743--death-note` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 174/174 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 174/174 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cover.cdnlibs.org/.../d958edaf-9004-4b9a-a259-48938ccc0811.jpg` (image/jpeg, 96755 bytes, 375x511) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../272743--death-note` |  |  |  |
| details thumbnail URL | PASS | `https://cover.cdnlibs.org/.../d958edaf-9004-4b9a-a259-48938ccc0811.jpg` |  |  |  |
| details author | PASS | Tsugumi Ohba |  |  |  |
| details artist | PASS | Takeshi Obata |  |  |  |
| details genres | PASS | Манга, 18+ (RX), Боевик, Детектив, Драма, Психология, Сверхъестественное, Сёнэн, Трагедия, Триллер, Полиция, Антигерой, Не хентай |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Тетрадь смерти (Официальная цветная версия)<br>★★★★☆ 8.0 (голосов: 7)<br>Альтернативные названия:<br>Death Note (Official Colored) / Desu Nōto / Тетрадь смерти / デスノート<br><br>Ягами Лайт — образцовый 17-летний выпускник, баллы за экзамены которого находятся в первых строках рейтинга всей Японии. Сидя на уроке он замечает, что за окном что-то упало. После уроков он поднимает загадочный предмет и им оказывается чёрная тетрадь с надписью «Тетрадь смерти». Внутри была инструкция по использованию: «Человек, чьё имя будет записано в тетради — умрёт». Имея свои взгляды на систему наказания, Лайт решает установить собственное правосудие, использовать тетрадь для \"очищения\" мира от зла — убивать преступников. Когда действия Лайта становятся заметны для мирового правительства, на след неуловимого «Киры» (так мир окрестили нового мессию, решившего искоренить зло на планете) выходит детектив мирового класса, называющий себя «L», который поставил себе цель — поймать убийцу.<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 14 chapters |  |  |  |
| chapter dates | PASS | 14 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 404 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
