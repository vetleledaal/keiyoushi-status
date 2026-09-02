# Extension Validation Report

- Extension: tachiyomi-ru.inkstory-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 941207398290674942
- Source name: InkStory
- Source language: ru
- Selected manga input: popular offset 0: Поднятие уровня в одиночку (`.../solo-leveling`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Поднятие уровня в одиночку (`.../solo-leveling`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Охотник-суицидник SSS-уровня (`.../sss-class-revival-hunter`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Нарисованная мной жуткая яндере стала реальностью! (`.../the-yandere-character-i-drew-has-become-a-real-person`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Альмарк (`.../almark`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 30 | Поднятие уровня в одиночку (`.../solo-leveling`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Поднятие уровня в одиночку (`.../solo-leveling`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 404 | Том 1 Глава 0 - Пролог (`.../d0bd2e80-c180-420a-8eae-d6c30f26f068`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 4 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Поднятие уровня в одиночку, URL=`.../solo-leveling` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 150/150 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 150/150 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.inuko.me/.../65ae6e4c-d952-4ef6-831a-0c982baa72b0.jpeg` (image/jpeg, 317676 bytes, 800x1080; server Content-Type: image/png) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../solo-leveling` |  |  |  |
| details thumbnail URL | PASS | `https://static.inuko.me/.../65ae6e4c-d952-4ef6-831a-0c982baa72b0.jpeg` |  |  |  |
| details author | PASS | Gee So-Lyung |  |  |  |
| details artist | PASS | Jang Sung-lak |  |  |  |
| details genres | PASS | приключения, фэнтези, сёнэн, боевик, webtoon, colored |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Десятилетие назад мир изменился навсегда — открылись таинственные «Врата», соединившие нашу реальность с параллельным измерением. Избранные люди обрели сверхъестественные способности и стали известны как охотники — те, кто противостоит монстрам, проникающим через эти порталы.<br>Я, Сон Джин Ву, принадлежу к низшей касте охотников — рангу E. День за днём я рискую жизнью в самых опасных глубинах подземелий, не обладая особыми талантами и едва сводя концы с концами. Но судьба преподнесла мне удивительный подарок — в недрах одного из самых сложных подземелий ранга D я обнаружил нечто невероятное.<br>После смертельной схватки я очнулся, наделённый уникальной силой и способностью видеть таинственный журнал заданий, недоступный другим. Теперь, следуя этим указаниям и оттачивая мастерство в битвах с монстрами, я неуклонно расту в силе. Так начался мой путь от самого слабого охотника к вершине могущества — заветному рангу S!<br><br>External links:<br>https://www.mangaupdates.com/.../solo-leveling<br>https://shikimori.me/.../121496-solo-leveling |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 404 chapters |  |  |  |
| chapter dates | PASS | 404 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://static.inuko.me/.../5db40151-1ef5-x6d5-8d9a-c39428175fcd.jpeg` (image/jpeg, 901465 bytes, 720x8860; server Content-Type: application/octet-stream) |  |  |  |
