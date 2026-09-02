# Extension Validation Report

- Extension: tachiyomi-es.bloomscans-v1.4.35
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 32
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2598725055968738551
- Source name: Bloom Scans
- Source language: es
- Selected manga input: latest offset 0: Renacida para Gobernar (`.../renacida-para-gobernar`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | Juventud en caos y amor (`.../juventud-en-caos-y-amor`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 13 | El brillo que nos heria (`.../el-brillo-que-nos-heria`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 50 | Renacida para Gobernar (`.../renacida-para-gobernar`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 13 | Reescribiendo el Final (`.../reescribiendo-el-final`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Renacida para Gobernar (`.../renacida-para-gobernar`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Renacida para Gobernar (`.../renacida-para-gobernar`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 224 | Chapter 0 (`.../dominare-esta-familia-capitulo-0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 7 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Renacida para Gobernar, URL=`.../renacida-para-gobernar` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Reescribiendo el Final, URL=`.../reescribiendo-el-final` at page 1 offset 48 and page 2 offset 0, title=La bestia y la hija  del barón, URL=`.../la-bestia-y-la-hija-del-baron` at page 1 offset 49 and page 2 offset 1 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 127/127 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 127/127 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://bloomscans.com/.../noimg165px.png` -> 3 manga URLs (examples: `.../jardin-de-mayo`, `.../la-muneca-de-los-recuerdos`, `.../su-majestad-es-mi-jefe-ideal`) |  |  |  |
| thumbnail | PASS | `https://bloomscans.com/.../Titulo_bloom.webp` (image/webp (container: extended), 485730 bytes, 1024x1536) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../renacida-para-gobernar` |  |  |  |
| details thumbnail URL | PASS | `https://bloomscans.com/.../Titulo_bloom.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasía, Reencarnación, Romance |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | “…Muy bien. Observen cómo lo hago. Seré yo quien tome las riendas de este linaje”. Firentia no solo reencarnó; nació como la hija ilegítima de los Lombardi, la dinastía más poderosa del Imperio. Dueños de una riqueza obscena y arquitectos de la cultura y la diplomacia, los Lombardi no solo viven en el Imperio: ellos SON el Imperio. Parecía el destino perfecto, una vida de oro garantizada… hasta que la tragedia la golpeó sin piedad. Su padre murió, sus parientes la desecharon como basura y la gloriosa familia que juró proteger terminó desmoronándose hasta las cenizas. Ahogada en la rabia y el alcohol, su vida terminó bajo las ruedas de un carruaje. Una muerte patética para una mujer con tanta sed de justicia. “Esto tiene que ser una broma… el destino no puede ser tan cruel”. Pero el destino tenía otros planes. Al abrir los ojos, el tiempo se ha doblegado: ¡ha regresado a los siete años! Ahora, con el conocimiento de su vida pasada y la astucia de una mujer que lo perdió todo, tiene una segunda oportunidad para reescribir la historia. No solo salvará a su amado padre, sino que evitará la caída de su imperio familiar. ¿Y qué hay del Segundo Príncipe? El hombre que fue el enemigo jurado de su familia ahora la persigue con la devoción de un cachorro fiel. ¡Que empiece el juego! El príncipe, la fortuna y el poder… ¡todo le pertenecerá a ella! De paria a emperatriz de los negocios: comienza el audaz proyecto de Firentia para conquistar la cima en su tercera vida. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 224 chapters |  |  |  |
| chapter dates | PASS | 224 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `https://bloomscans.com/.../9be8276d79eacc06dcbc310a.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
