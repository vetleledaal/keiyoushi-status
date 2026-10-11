# Extension Validation Report

- Extension: tachiyomi-ru.puremanga-v1.6.4
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: inkstory
- Source ID: 501392872283294667
- Source name: PureManga
- Source language: ru
- Selected manga input: popular offset 0: Распятие Шести (`.../juujika-no-rokunin`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Распятие Шести (`.../juujika-no-rokunin`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Расколотая битвой синева небес (`.../doupo-cangqiong-dou-po-cang-qiong`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Классная комната (`.../homeroom`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Тёмный дворецкий (`.../kuroshitsuji`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Распятие Шести (`.../juujika-no-rokunin`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Распятие Шести (`.../juujika-no-rokunin`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 243 | Том 1 Глава 1 - Перерождение экспериментального тела "А" (`.../e61cce8e-8524-4a75-8297-168aea9d7d62`) |  | <1s |
| pages | `getPageList(chapter)` | success | 73 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Распятие Шести, URL=`juujika-no-rokunin` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Всё равно это исекай, URL=`amuteun-lopan-majseubnida` at page 1 offsets 1, 22 and page 2 offsets 3, 8, 21, title=Дочь злодея планирует сбежать, URL=`the-villain-s-daughter-plans-to-run-away-2024` at page 1 offsets 4, 25 and page 2 offsets 6, 27, title=Возвращение героя, URL=`hero-returns` at page 1 offsets 5, 23 and page 2 offsets 1, 9, 26, title=Приди же в Мир Демонов, Ирума-кун!, URL=`heres-come-the-demon-iruma-kun` at page 1 offset 7 and page 2 offsets 7, 28, title=Промокая под нежным дождём, URL=`just-getting-wet-in-the-rain` at page 1 offsets 20, 29 and page 2 offset 13, title=Для меня игра - убийство, URL=`cage-murderous-level-up` at page 1 offset 24 and page 2 offsets 11, 25, title=Мама вышла замуж по контракту, URL=`my-mother-got-married-by-contract` at page 1 offset 26 and page 2 offsets 14, 24 |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 6 manga entries; Latest page 2 repeats 8 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.inuko.me/.../667e655f-c30e-49f2-9d01-d39f5943a72a.png` (image/png, 2887157 bytes, 1290x1523) |  |  |  |
| details identity | PASS | Details preserved selected URL `juujika-no-rokunin` |  |  |  |
| details thumbnail URL | PASS | `https://static.inuko.me/.../667e655f-c30e-49f2-9d01-d39f5943a72a.png` |  |  |  |
| details author | PASS | Накатакэ Сирюу |  |  |  |
| details artist | PASS | Накатакэ Сирюу |  |  |  |
| details genres | PASS | психология, драма, школа, сёнэн, ужасы, трагедия, боевик, web |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Сюн Урума, ученик шестого класса, которого пять одноклассников назвали «Экспериментальным телом: А», они подвергали его жестоким издевательствам, он жил в аду. Единственной отрадой были младший брат и родители, которые защищали его .... пока пять монстров их не убили.<br><br>Когда он наконец теряет все и сталкивается с настоящим адом, внутри Сюна рождается тёмное «желание». Он переродился под воздействием тренировок своего деда, который служил в секретном подразделении во время Второй мировой войны. Теперь, четыре года спустя, он предстанет перед своим судьбоносным врагом.<br><br>**Рейтинг**: 9.18 (оценок: 347)<br>**Просмотры**: 7.3M<br>**Лайки**: 63.2k<br>**Закладки**: 13.7k<br>**Внешние ссылки**:<br>- \[mangaupdates.com\](https://www.mangaupdates.com/.../juujika-no-rokunin)<br>- \[mangabaka.org\](https://mangabaka.org/.../239)<br>- \[mangadex.org\](https://mangadex.org/.../juujika-no-rokunin)<br>- \[pocket.shonenmagazine.com\](https://pocket.shonenmagazine.com/.../10834108156770131563) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 243 chapters |  |  |  |
| chapter dates | PASS | 243 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 73 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://static.inuko.me/.../fff7ae84-4ab3-x9ed-b412-041731a524b6.webp` (image/webp (encoding: lossy), 40120 bytes, 785x1079; server Content-Type: application/octet-stream) |  |  |  |
