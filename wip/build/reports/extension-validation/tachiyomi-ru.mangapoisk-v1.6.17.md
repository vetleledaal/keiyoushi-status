# Extension Validation Report

- Extension: tachiyomi-ru.mangapoisk-v1.6.17
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4092015241327675443
- Source name: MangaPoisk
- Source language: ru
- Selected manga input: popular offset 0: Во всеоружии (перезапуск) (`.../overgeared-abs3nSd`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | Во всеоружии (перезапуск) (`.../overgeared-abs3nSd`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | Господин герой, надеюсь вам было приятно прошлой ночью. (`.../hero-sama-i-hope-you-had-fun-last-night`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | Сараш (`.../sarasah-abs3GKd`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Ван Пис (`.../van-pis-abs3WwC`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Во всеоружии (перезапуск) (`.../overgeared-abs3nSd`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Во всеоружии (перезапуск) (`.../overgeared-abs3nSd`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 285 | Том 1 Глава 0 (`.../1-0`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 6 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Во всеоружии (перезапуск), URL=`.../overgeared-abs3nSd` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static2.mangapoisk.me/.../t4RzpQtznsuXgOcMFrz8GKcGIUz4UQVq1Nspj1uM_mini.jpg` (image/jpeg, 46610 bytes, 280x398) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../overgeared-abs3nSd` |  |  |  |
| details thumbnail URL | PASS | `https://static2.mangapoisk.me/.../t4RzpQtznsuXgOcMFrz8GKcGIUz4UQVq1Nspj1uM_mini.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | боевик, приключения, фэнтези, сёнэн |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Долгое время ему не везло в играх. Постоянно проигрывая, он привык быть неудачником. Но однажды, играя, он нашел в глубине Северной пещеры квест, открывший свой секрет. Обретя «Редкую книгу Пагмы», игрок преображается. Теперь ему удается то, е чем мечтают миллионы пользователей. Но открывать тайну своего спасения он не будет. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 285 chapters |  |  |  |
| chapter dates | LINT | 24 of 285 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=24 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://static2.mangapoisk.me/.../MDkctq3K66IQKaFSUwsRiw9OFAsb0WEQ1BKPONiF.jpg <redacted query values: quality>` (image/jpeg, 1218171 bytes, 720x17133) |  |  |  |
