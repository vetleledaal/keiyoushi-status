# Extension Validation Report

- Extension: tachiyomi-ru.mangamen-v1.4.2
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
- Source ID: 601889634773560665
- Source name: MangaMen
- Source language: ru
- Selected manga input: latest offset 0: Вторая жизнь презираемой мачехи (`.../stepmom-left`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 60 | Поднятие уровня в одиночку (`.../1344-solo-leveling`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 60 | Становление богом (`.../apotheosis-elevation-to-the-status-of-a-god`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 60 | Вторая жизнь презираемой мачехи (`.../stepmom-left`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 60 | В моём завещании совсем не это имелось в виду. (`.../my-will-didnt-mean-that`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Вторая жизнь презираемой мачехи (`.../stepmom-left`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Вторая жизнь презираемой мачехи (`.../stepmom-left`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 20 | Том 1. Глава 1 (`.../c1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 37 |  |  | 1-10s |

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
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 60 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Вторая жизнь презираемой мачехи, URL=`.../stepmom-left` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 241/241 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 241/241 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://zx.mangamen.com/.../b63d4ee28daf0d14c87e0a2f29c0026d.webp` (image/webp (encoding: lossy), 51246 bytes, 348x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../stepmom-left` |  |  |  |
| details thumbnail URL | PASS | `https://zx.mangamen.com/.../b63d4ee28daf0d14c87e0a2f29c0026d.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Манхва, приключения, романтика, сёдзё, Антигерой, ГГ женщина, Аристократия |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | «Если я вдруг умру… ты присмотришь за моей семьёй вместо меня?»<br><br>Ради моей любимой лучшей подруги я вышла замуж за её мужа.<br>Это была последняя просьба единственной настоящей подруги в этом мире. Чтобы защитить двух детей, которых она оставила после себя, я стала их мачехой.<br><br>Терпя глубокую ненависть её сыновей и суровые, осуждающие взгляды общества, я семь долгих лет жила в договорном браке - лишь бы исполнить данное обещание. Но как только дети достигли совершеннолетия, я ушла без малейшего сожаления - ровно так, как мы и договаривались.<br><br>И вот, когда я наконец собиралась начать жить по-своему, передо мной стали появляться совершенно неожиданные люди.<br><br>Третий принц, который семь лет назад бесследно исчез; моя первая любовь, о которой я не забывала ни единого дня; и даже бывший муж с пасынками, которые только теперь поняли, что потеряли!<br><br>Альтернативные названия: stepmom left / 새엄마가 떠났다<br><br>Статус перевода: Продолжается<br>Дата релиза: 2026<br>Формат: Веб, В цвете<br>Загружено глав: 20<br>Просмотров: 3746<br>Рейтинг: 16+ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 20 chapters |  |  |  |
| chapter dates | PASS | 20 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 37 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cloud.mangaimg.ru/.../4a249875-d7bf-4654-8a00-740c26c64217.webp` (image/webp (encoding: lossy), 496592 bytes, 720x4093) |  |  |  |
