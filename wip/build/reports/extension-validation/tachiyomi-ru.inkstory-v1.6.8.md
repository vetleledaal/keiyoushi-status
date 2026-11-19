# Extension Validation Report

- Extension: tachiyomi-ru.inkstory-v1.6.8
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: inkstory
- Source ID: 2026387314200968454
- Source name: InkStory
- Source language: ru
- Selected manga input: popular offset 0: Поднятие уровня в одиночку (`.../solo-leveling`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | Поднятие уровня в одиночку (`.../solo-leveling`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | Регрессировавший сын герцога — убийца (`.../the-reborn-young-lord-is-an-assassin`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 40 | Я стал младшим Богом войны (`.../rmhe-became-the-youngest-of-the-noconfidence-classes`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Гениальный рыцарь Падающего народа (`.../the-genius-knight-of-a-fallen-race`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 28 | Поднятие уровня в одиночку (`.../solo-leveling`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Поднятие уровня в одиночку (`.../solo-leveling`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 404 | Том 1 Глава 0: Пролог (`.../d0bd2e80-c180-420a-8eae-d6c30f26f068`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 4 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Поднятие уровня в одиночку, URL=`solo-leveling` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 188/188 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 188/188 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.inuko.me/.../65ae6e4c-d952-4ef6-831a-0c982baa72b0.jpeg` (image/jpeg, 317676 bytes, 800x1080) |  |  |  |
| details identity | PASS | Details preserved selected URL `solo-leveling` |  |  |  |
| details thumbnail URL | PASS | `https://static.inuko.me/.../65ae6e4c-d952-4ef6-831a-0c982baa72b0.jpeg` |  |  |  |
| details author | PASS | Chu-Gong |  |  |  |
| details artist | PASS | Redice Studio, DUBU (Redice Studio), DISCIPLES (Redice Studio) |  |  |  |
| details genres | PASS | Цветной, Вебтун, драма, приключения, сёнэн, трагедия, ужасы, боевик, фэнтези, Городское фэнтези, Тёмное фэнтези, Магия, Игровые элементы, Видеоигры, Подземелья, Взросление, Убийцы, Война, Преступления, Система, Сильный герой, Сильнейший герой, Антигерой, ГГ мужчина, Постапокалипсис, Суперсилы, Охотники, Трагическое прошлое, Травля, Демоны, Драконы, Боги |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ★★★★★ 9.62 (2937)<br>2018 · Корея · Просмотры 73.1M · Лайки 828k<br><br>Десятилетие назад мир изменился навсегда — открылись таинственные «Врата», соединившие нашу реальность с параллельным измерением. Избранные люди обрели сверхъестественные способности и стали известны как охотники — те, кто противостоит монстрам, проникающим через эти порталы.<br>Я, Сон Джин Ву, принадлежу к низшей касте охотников — рангу E. День за днём я рискую жизнью в самых опасных глубинах подземелий, не обладая особыми талантами и едва сводя концы с концами. Но судьба преподнесла мне удивительный подарок — в недрах одного из самых сложных подземелий ранга D я обнаружил нечто невероятное.<br>После смертельной схватки я очнулся, наделённый уникальной силой и способностью видеть таинственный журнал заданий, недоступный другим. Теперь, следуя этим указаниям и оттачивая мастерство в битвах с монстрами, я неуклонно расту в силе. Так начался мой путь от самого слабого охотника к вершине могущества — заветному рангу S!<br><br>**Журнал:** Kakao Webtoon, KakaoPage · **Издатель:** D&C Media, Daum, Redice Studio, Kakao<br><br>**Другие названия:**<br>- Solo Leveling<br>- 나 혼자만 레벨업<br>- Only I Level up<br>- I level up alone<br>- I am the only the one who levels up<br>- 俺だけレベルアップな件<br>- Ore Dake Level Up na Ken<br>- Na Honjaman Lebel-eob<br>- Yalnız Seviye Atlama<br>- 我独自升级<br>- Соло<br><br>**Внешние трекеры:**<br>- \[MangaUpdates\](https://www.mangaupdates.com/.../solo-leveling)<br>- \[MangaBaka\](https://mangabaka.org/.../3397)<br>- \[Shikimori\](https://shikimori.me/.../121496-solo-leveling) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 404 chapters |  |  |  |
| chapter dates | PASS | 404 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://static.inuko.me/.../5db40151-1ef5-x6d5-8d9a-c39428175fcd.jpeg` (image/jpeg, 901465 bytes, 720x8860; server Content-Type: application/octet-stream) |  |  |  |
