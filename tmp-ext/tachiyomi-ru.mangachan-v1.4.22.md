# Extension Validation Report

- Extension: tachiyomi-ru.mangachan-v1.4.22
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7
- Source name: MangaChan
- Source language: ru
- Selected manga input: popular offset 0: Girl the Wild's (`.../33-girl-the-wilds.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Girl the Wild's (`.../33-girl-the-wilds.html`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Re:Monster (`.../32360-remonster.html`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Mii-chan to Yamada-san (`.../174985-mii-chan-to-yamada-san.html`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Natsu to gēmu to futari no kūki (`.../174644-natsu-to-gmu-to-futari-no-kki.html`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 3 | Girl the Wild's (Шальные девчонки) (`.../33-girl-the-wilds.html`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Girl the Wild's (`.../33-girl-the-wilds.html`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 262 | Том 0 Глава 1 Пролог (`.../373720-girl-the-wilds_v0_ch1.html`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Girl the Wild's (Шальные девчонки), URL=`.../33-girl-the-wilds.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 83/83 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 83/83 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://imgcover.manga-chan.me/.../1341859425_i125583.jpg` (image/jpeg, 18510 bytes, 248x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../33-girl-the-wilds.html` |  |  |  |
| details thumbnail URL | PASS | `https://imgcover.manga-chan.me/.../1341859425_i125583.jpg` |  |  |  |
| details author | PASS | ﻿Yohan, Kim Hye Jin |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | манхва, боевик, боевые искусства, веб, гарем, драма, комедия, романтика, школа |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS |  Данная манхва о молодом парне Сон Чхегу у которого умер отец, и ушла мать... оставив его с братом и сестрой на произвол судьбы. Вскоре он поступает в школу где намерен получить достойное образование, и в дальнейшем устроится на хорошую работу. С этого момента и начинается его приключение в "Школе отвязных".  |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 262 chapters |  |  |  |
| chapter dates | PASS | 262 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img2.manga-chan.me/.../0001.png` (image/png, 518817 bytes, 690x7344) |  |  |  |
