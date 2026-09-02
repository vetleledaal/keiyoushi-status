# Extension Validation Report

- Extension: tachiyomi-ru.acomics-v1.4.8
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1396426423555611180
- Source name: AComics
- Source language: ru
- Selected manga input: popular offset 0: Living with HipsterGirl & GamerGirl (`.../about`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Living with HipsterGirl & GamerGirl (`.../about`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 10 | Потерянный кошмар [Lost Nightmare] (`.../about`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 10 | Мой странный напарник (`.../about`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | Moonlace (`.../about`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Living with HipsterGirl & GamerGirl (`.../about`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Living with HipsterGirl & GamerGirl (`.../about`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1240 | 1 (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | <1s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Living with HipsterGirl & GamerGirl, URL=`.../about` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://acomics.ru/.../b438-w568scg1zq.jpg` (image/jpeg, 19237 bytes, 160x90) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../about` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Jhon Alexander “Jago” Guerra, krogon500, Zarkon |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Игры, Юмор, Бытовое |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Парень, которого зовут Артур, снимает комнату, а его соседками оказались две девушки, одна из них - хипстерша, которую зовут Софи, а вторая - геймерша, которую зовут Эрика, и у них частенько что-то происходит, и это что-то не совсем нормальное. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1240 chapters |  |  |  |
| chapter dates | LINT | All 1240 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1240 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://acomics.ru/.../000001-5udl4juxxr.jpg` (image/jpeg, 564498 bytes, 1024x1034) |  |  |  |
