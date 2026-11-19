# Extension Validation Report

- Extension: tachiyomi-es.topcomicporno-v1.6.59
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 6716313068102878996
- Source name: TopComicPorno
- Source language: es
- Selected manga input: popular offset 0: Clase Secreta Sin Censura (`.../2723`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Clase Secreta Sin Censura (`.../2723`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Stargram Goddess (`.../4458`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Todas mis antiguas compañeras de clase son putas (`.../17625`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | My first time (`.../8089`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Clase Secreta Sin Censura (`.../2723`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Clase Secreta Sin Censura (`.../2723`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 171 | Capitulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 70 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Clase Secreta Sin Censura, URL=`2723` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://topcomicporno.com/.../clase-secreta-sin-censura-350x476.jpg` (image/jpeg, 23035 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `2723` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://topcomicporno.com/.../clase-secreta-sin-censura.jpg.webp` (image/webp (encoding: lossy), 30086 bytes, 444x842) |  |  |  |
| details author | PASS | Gang-cheol Wang |  |  |  |
| details artist | PASS | Minachan |  |  |  |
| details genres | PASS | Comedia, Drama, Harem, Madura, Milf, Romance, Sexo Público, Sin Censura, Suspenso |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Dae Ho, que quedó huérfano a los 13 años, fue adoptado por un amigo de su padre. Sin embargo, Dae Ho en la edad adulta no sabía nada sobre la relación entre hombres y mujeres. Leer Clase Secreta Sin Censura Manga en Español.<br><br>La tía y las hermanas decidieron darle una clase secreta a Dae Ho puro … Esta historia trata sobre una esposa de dos hijos que engaña a su esposo con quien tiene dos hijas y un niño al que acogieron.<br><br>Manga también conocida como Comic Porno (AKA) » Secret Class; Bimilsueop, Lecciones Secretas«. Este webtoon en curso se lanzó en 2019. La historia fue escrita por Gang-cheol Wang y las ilustraciones por Minachan.El webtoon de Secret Class Sin Censura trata sobre la historia de Comedia, Harem, Madura, Romance y Recuentos de la vida.<br><br>Leer Mangas \| Manhwas \| Comic Porno \| Pornhwa \| WebToon en TopComicPorno totalmente Gratis.<br><br>Nombres Alternativos: Secret Class; Bimilsueop; Lecciones Secretas |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 171 chapters |  |  |  |
| chapter dates | LINT | All 171 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=171 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 70 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `http://topcomicporno2.b-cdn.net/.../001.jpg` to `https://topcomicporno2.b-cdn.net/.../001.jpg` (1 redirects) |  |  |  |
| page load | PASS | `http://topcomicporno2.b-cdn.net/.../001.jpg` (image/jpeg, 185088 bytes, 1080x2048) |  |  |  |
