# Extension Validation Report

- Extension: tachiyomi-es.topcomicporno-v1.6.55
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Selected manga input: popular offset 0: EL ARCA SOY YO (`.../1886`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | EL ARCA SOY YO (`.../1886`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Qué le sucede a esta familia (`.../16201`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | La Caída De La Princesa Lynnea (`.../18307`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Esfuerzo De Los Profesores (`.../16907`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | EL ARCA SOY YO (`.../1886`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | EL ARCA SOY YO (`.../1886`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 122 | Capitulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 33 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=EL ARCA SOY YO, URL=`1886` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://topcomicporno.com/.../perdona-pero-es-mi-habitacion-175x238.jpg` (image/jpeg, 10253 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `1886` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://topcomicporno.com/.../perdona-pero-es-mi-habitacion.jpg.webp` (image/webp (encoding: lossy), 17638 bytes, 270x400) |  |  |  |
| details author | PASS | LObeam |  |  |  |
| details artist | PASS | kook |  |  |  |
| details genres | PASS | Comedia, Drama, Romance, Sexo Público, Suspenso |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Kim Jinsoo termina mudándose con su matón personal … ¿Podrá encontrar el amor entre su matón y su enamorado? EL ARCA SOY YO Manga Online y español en www.TopComicPorno.com.<br><br>Excuse me, This is my Room también conocida como Comic (AKA) «Excuse me, This is my Room; EL ARCA SOY YO, The Ark is Me» Este webtoon en marcha se lanzó en 2020. La historia fue escrita por LObeam y las ilustraciones por kook. Este webtoon trata sobre drama, historia para adultos<br><br>Estamos actualizando la pagina, para posible error en esta pagina visita: www.manhwas.es<br><br>Los Mejores Manga Online, Manhwa Online y Comics Porno en www.TopComicPorno.com Gratis.<br><br>Únete al Canal de Telegram: @Comics_PornoYMas<br><br>Descubre una amplia variedad de los mejores mangas, cómics, manhuas, webtoons y manhwas completamente en español en: www.TopComicPorno.com, ¡totalmente gratis!<br><br>TopComicPorno.com es el refugio virtual para los apasionados del manga, manhwa, manhua y cómic. Sumérgete en un universo de narrativas cautivadoras, donde las historias y aventuras te transportarán a mundos increíbles y emocionantes.<br><br>Desde emocionantes sagas de acción hasta conmovedoras historias de romance, en TopComicPorno.com encontrarás una amplia selección de títulos que satisfarán todos tus gustos. Ya sea que estés buscando nuevas recomendaciones, reseñas detalladas o simplemente desees explorar el vasto mundo del manga y el cómic, nuestro sitio tiene todo lo que necesitas para alimentar tu pasión.<br><br>Además, podrás disfrutar de una gran variedad de contenido adicional, como divertidos memes, creativo fanArt y participar en apasionantes discusiones con la comunidad. ¡Explora nuestro sitio hoy mismo y sumérgete en el fascinante mundo de los mangas y manhwas en TopComicPorno.com!<br><br>Nombres Alternativos: Excuse me, This is my Room, EL ARCA SOY YO, The Ark is Me |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 122 chapters |  |  |  |
| chapter dates | LINT | All 122 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=122 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `http://topcomicporno2.b-cdn.net/.../001.jpg` to `https://topcomicporno2.b-cdn.net/.../001.jpg` (1 redirects) |  |  |  |
| page load | PASS | `http://topcomicporno2.b-cdn.net/.../001.jpg` (image/jpeg, 335510 bytes, 720x2604) |  |  |  |
