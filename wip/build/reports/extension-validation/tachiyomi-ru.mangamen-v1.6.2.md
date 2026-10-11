# Extension Validation Report

- Extension: tachiyomi-ru.mangamen-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 27
- Lint: 0
- Warnings: 0
- Skipped: 9
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 601889634773560665
- Source name: MangaMen
- Source language: ru
- Selected manga input: popular offset 0: Поднятие уровня в одиночку (`.../1344-solo-leveling`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 60 | Поднятие уровня в одиночку (`.../1344-solo-leveling`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 60 | Становление богом (`.../apotheosis-elevation-to-the-status-of-a-god`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 60 | Смертельно больная злодейка хочет сбежать от мужа (`.../shes-a-sick-villain-but-her-fiance-is-so-protective-of-her-that-she-wants-to-run-away`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 60 | Невеста Обсидиан (`.../the-bride-of-obsidian`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Поднятие уровня в одиночку (`.../1344-solo-leveling`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Поднятие уровня в одиночку (`.../1344-solo-leveling`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 60 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Поднятие уровня в одиночку, URL=`.../1344-solo-leveling` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 243/243 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 243/243 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://zx.mangamen.com/.../455bce2be1ac1ec5b1429c4c81af285b.jpg` (image/jpeg, 122454 bytes, 375x506) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1344-solo-leveling` |  |  |  |
| details thumbnail URL | PASS | `https://zx.mangamen.com/.../455bce2be1ac1ec5b1429c4c81af285b.jpg` |  |  |  |
| details author | PASS | GEE So-Lyung |  |  |  |
| details artist | PASS | Jang Sung-lak,Redice Studio |  |  |  |
| details genres | PASS | Манхва, боевик, приключения, сёнэн, фэнтези, Демоны, Магия, Призраки / Духи, Монстры, Выживание, Армия, Артефакты, Бои на мечах, Волшебные существа, Гильдии, ГГ мужчина, Драконы, Ранги силы, Животные компаньоны, Игровые элементы, Квесты, Навыки / способности, Нежить, Подземелья, Разумные расы, Система, Скрытие личности, Холодное оружие, Волшебники / маги, ГГ имба, Умный ГГ, Эльфы, Брат и сестра, Легендарное оружие |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 10 лет назад, после того, как «Врата», соединившие реальный мир с параллельным, открылись, некоторые из людей получили силу охотиться на монстров внутри "Врат".Они известны как «Охотники». Однако не все Охотники сильные. Меня зовут Сон Джин Ву - охотник E-ранга. Я тот, кто рискует своей жизнью в самых низких уровнях подземелья. Не имея никаких сверхсильных навыков, я едва зарабатывал необходимые деньги, сражаясь в низкоуровневых подземельях ... по крайней мере, пока я не нашел скрытое подземелье с самыми трудными проблемами в подземельях D-ранга! В конце концов, когда я умер, я внезапно получил странную силу, журнал заданий, который мог видеть только я, секрет для поднятия уровня, о котором знаю только я! Если я тренировался в соответствии с моими заданиями и охотился на монстров, мой уровень повышался. Переход от самого слабого Охотника к самому сильному, Охотнику S-ранга!<br><br>Альтернативные названия: Na Honjaman Lebel-eob / Solo Leveling<br><br>Издатель: D&C Media,Kakao<br>Дата релиза: 2018<br>Формат: В цвете, Веб<br>Загружено глав: Нет глав<br>Просмотров: 20325427<br>Рейтинг: 16+<br>Переводчики: Dead Inside Team, Ньюби, Assley Team |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
